package com.kapx.sprintboot.kafka.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {
    private Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(topics = "test-topic")
    public void onMessage(ConsumerRecord<?, ?> consumerRecord) {
        logger.info("Receiver on test-topic: " + consumerRecord.toString());
    }

}
