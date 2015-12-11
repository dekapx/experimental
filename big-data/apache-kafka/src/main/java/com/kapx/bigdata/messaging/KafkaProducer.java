package com.kapx.bigdata.messaging;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.IOUtils;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class KafkaProducer {
	final static String TOPIC = "kafkatopic";

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.put("metadata.broker.list", "localhost:9092");
		properties.put("serializer.class", "kafka.serializer.StringEncoder");
		ProducerConfig producerConfig = new ProducerConfig(properties);
		kafka.javaapi.producer.Producer<String, String> producer = new kafka.javaapi.producer.Producer<String, String>(producerConfig);
		for (int i = 0; i < 1000; i++) {
			final List<String> commits = IOUtils.readLines(ClassLoader.getSystemResourceAsStream("changelog.txt"), Charset.defaultCharset().name());
			for (String commit : commits) {
				KeyedMessage<String, String> message = new KeyedMessage<String, String>(TOPIC, commit);
				producer.send(message);
			}
		}
		producer.close();
	}
}
