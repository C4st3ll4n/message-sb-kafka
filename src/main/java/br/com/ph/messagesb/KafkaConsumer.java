package br.com.ph.messagesb;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "hello", groupId = "g1")
    public void receiveMessage(String message) {
        if (message != null) {

            System.out.println(message);
        } else {
            System.out.println("Waiting...");
        }

    }


}

