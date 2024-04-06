package com.arun.journal.consumer;

import com.arun.journal.util.ApplicationConstants;
import org.springframework.kafka.annotation.KafkaListener;

public class UserManagementSystemDataConsumer {

    @KafkaListener(topics = ApplicationConstants.TOPIC_NAME, groupId = ApplicationConstants.GROUP_ID_JSON)
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
