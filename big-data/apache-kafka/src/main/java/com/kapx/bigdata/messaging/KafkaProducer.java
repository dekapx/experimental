package com.kapx.bigdata.messaging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class KafkaProducer {
	final static String TOPIC = "kafkatopic";

	public static void main(String[] args) {
		final Properties properties = new Properties();
		properties.put("metadata.broker.list", "localhost:9092");
		properties.put("serializer.class", "kafka.serializer.StringEncoder");
		final ProducerConfig producerConfig = new ProducerConfig(properties);
		final kafka.javaapi.producer.Producer<String, String> producer = new kafka.javaapi.producer.Producer<String, String>(producerConfig);
		final SimpleDateFormat dateFormat = new SimpleDateFormat();
		final KeyedMessage<String, String> message = new KeyedMessage<String, String>(TOPIC, "Test message from java program " + dateFormat.format(new Date()));
		producer.send(message);
		producer.close();
	}
}
