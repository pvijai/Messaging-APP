package com.kafka.kafkaTest.config;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/message")
public class messageController {

        private KafkaTemplate<String,String> kafkaTemplate;

    public messageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
@PostMapping
    public void publish(@RequestBody messageRequest request){
        kafkaTemplate.send("topic3", request.message());
    }
}
