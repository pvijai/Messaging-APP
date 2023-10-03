package com.kafka.kafkaTest.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class topicConfig {
        @Bean
        public NewTopic topicCreation(){
            return TopicBuilder.name("topic3").build();
        }

}
