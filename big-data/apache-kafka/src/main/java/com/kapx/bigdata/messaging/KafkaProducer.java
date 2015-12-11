package com.kapx.bigdata.messaging;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
		for (int i = 0; i < 10; i++) {
			TimeUnit.SECONDS.sleep(2);
			KeyedMessage<String, String> message = new KeyedMessage<String, String>(TOPIC, "Message for Kafka-" + i);
			producer.send(message);
		}
		producer.close();
	}
}
