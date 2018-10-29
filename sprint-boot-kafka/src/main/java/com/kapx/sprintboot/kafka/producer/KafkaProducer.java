package com.kapx.sprintboot.kafka.producer;

public interface KafkaProducer {
    void send(String topic, String payload);
}
