package com.kapx.kafka.messaging;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class MessageConsumer {
	private static final String KAFKA_TOPIC = "kafkatopic";

	public static void main(String[] args) throws Exception {
		final Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("group.id", "test");
		props.put("enable.auto.commit", "true");
		props.put("auto.commit.interval.ms", "1000");
		props.put("session.timeout.ms", "30000");
		props.put("key.deserializer", StringDeserializer.class.getName());
		props.put("value.deserializer", EventDeserializer.class.getName());

		final KafkaConsumer<String, Event> consumer = new KafkaConsumer<>(props);
		consumer.subscribe(Arrays.asList(KAFKA_TOPIC));
		while (true) {
			ConsumerRecords<String, Event> records = consumer.poll(100);
			for (ConsumerRecord<String, Event> record : records) {
				final String key = record.key();
				final Event event = record.value();
				System.out.println(key + " -> " + event.toString());
			}
		}
	}
}
