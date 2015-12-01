package com.kapx.bigdata.topology;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import backtype.storm.Config;
import backtype.storm.ILocalCluster;
import backtype.storm.Testing;
import backtype.storm.generated.StormTopology;
import backtype.storm.testing.CompleteTopologyParam;
import backtype.storm.testing.MkClusterParam;
import backtype.storm.testing.MockedSources;
import backtype.storm.testing.TestJob;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

public class TopologyTest {
	@Ignore
	@Test
	public void verifyProperValuesAreEmittedByEachBolt() {
		final Config config = new Config();
		config.setDebug(true);

		final MkClusterParam clusterParam = new MkClusterParam();
		clusterParam.setSupervisors(1);
		clusterParam.setDaemonConf(config);

		Testing.withSimulatedTimeLocalCluster(clusterParam, new TestJob() {
			@Override
			@SuppressWarnings("rawtypes")
			public void run(ILocalCluster cluster) {
				final MockedSources mockedSources = new MockedSources();
				mockedSources.addMockData("commit-feed-listener", new Values("12345 test@dummy.com"));

				final Config config = new Config();
				config.setDebug(true);

				final CompleteTopologyParam topologyParam = new CompleteTopologyParam();
				topologyParam.setMockedSources(mockedSources);
				topologyParam.setStormConf(config);

				final TopologyBuilder builder = new TopologyBuilder();
				builder.setSpout("commit-feed-listener", new CommitFeedListener());
				builder.setBolt("email-extractor", new EmailExtractor()).shuffleGrouping("commit-feed-listener");
				builder.setBolt("email-counter", new EmailCounter()).fieldsGrouping("email-extractor", new Fields("email"));

				final StormTopology topology = builder.createTopology();

				final Map result = Testing.completeTopology(cluster, topology, topologyParam);
				assertTrue(Testing.multiseteq(new Values(new Values("12345 test@manning.com")), Testing.readTuples(result, "commit-feed-listener")));
				assertTrue(Testing.multiseteq(new Values(new Values("test@manning.com")), Testing.readTuples(result, "email-extractor")));
				assertTrue(Testing.multiseteq(new Values(), Testing.readTuples(result, "email-counter")));
			}
		});
	}
}