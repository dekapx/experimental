package com.kapx.kafka.messaging;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class MessageProducer {
	private static final String KAFKA_TOPIC = "kafkatopic";

	public static void main(String[] args) throws Exception {
		final Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, EventSerializer.class.getName());

		final KafkaProducer<String, Event> producer = new KafkaProducer<String, Event>(props);

		for (int i = 1; i <= 10; i++) {
			Event event = new Event(i, "Event-" + i);
			ProducerRecord<String, Event> producerRecord = new ProducerRecord<String, Event>(KAFKA_TOPIC, "" + i, event);
			producer.send(producerRecord);
			System.out.println(i + " event sent...");
			TimeUnit.SECONDS.sleep(1);
		}
		producer.close();
	}
}
