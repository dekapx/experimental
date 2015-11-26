package com.kapx.bigdata.storm.spout;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

@SuppressWarnings("serial")
public class CommitFeedListener extends BaseRichSpout {
	private SpoutOutputCollector outputCollector;
	private List<String> commits;

	@Override
	public void nextTuple() {
		for (String commit : commits) {
			outputCollector.emit(new Values(commit));
		}
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void open(final Map configMap, final TopologyContext context, final SpoutOutputCollector outputCollector) {
		this.outputCollector = outputCollector;
		try {
			IOUtils.readLines(ClassLoader.getSystemResourceAsStream("file-name.txt"));
		} catch (IOException e) {
			throw new RuntimeException("Exception while reading file contents.", e);
		}
	}

	@Override
	public void declareOutputFields(final OutputFieldsDeclarer fieldsDeclarer) {
		fieldsDeclarer.declare(new Fields("commit"));
	}

}
