package br.com.ph.messagesb;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private final KafkaTemplate<String, String> template;

    public MessageProducer(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void sendMessage(String message){
        template.send("hello",message);
    }
}
