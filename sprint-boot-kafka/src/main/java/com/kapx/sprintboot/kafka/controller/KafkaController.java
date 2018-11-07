package com.kapx.sprintboot.kafka.controller;

import com.kapx.sprintboot.kafka.producer.KafkaProducerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CONFLICT;

@RestController
@RequestMapping("/api")
public class KafkaController {
    private Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private KafkaProducerImpl kafkaProducer;

    @GetMapping(value = "/ping", produces = "application/json")
    public String home() {
        return "Hi! this URL is active...";
    }

    @PostMapping("/kafka")
    public String sendToTopic(@RequestBody final String message) {
        // TODO: @RequestBody final Message message
        // accept JSON & XML
        // convert this message to object and send to message producer
        kafkaProducer.send(message);
        logger.info("Sending message to topic...");
        return "message [" + message + "] sent...";
    }

    @ExceptionHandler
    @ResponseStatus(CONFLICT)
    public String handleException(final Exception e) {
        return e.getMessage();
    }
}