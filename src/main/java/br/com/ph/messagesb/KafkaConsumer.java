package br.com.ph.messagesb;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "hello", groupId = "g1")
    public void receiveMessage(String message) {
        System.out.println(Objects.requireNonNullElse(message, "Waiting..."));

    }


}

