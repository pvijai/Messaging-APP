package com.kafka.kafkaTest.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListeners {

    @KafkaListener(topics = "topic3",groupId = "gp3")
    void listener(String data){
        System.out.println("data" +data);
    }
}
