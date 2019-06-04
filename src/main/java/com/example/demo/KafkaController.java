package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private final KafkaProducer producer;

    public KafkaController(final KafkaProducer producer) {
        this.producer = producer;
    }

    @RequestMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestParam("message") final String message){
        this.producer.sendMessage(message);
        return "Hello World!";
    }

}
