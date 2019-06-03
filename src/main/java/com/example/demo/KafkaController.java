package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @RequestMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestParam("message") final String message){
        return "Hello World!";
    }

}
