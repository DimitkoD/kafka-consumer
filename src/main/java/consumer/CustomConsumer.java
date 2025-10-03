package consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomConsumer {

    @KafkaListener(topics = "orders", groupId = "order-group")
    public void listen(String message) {
        System.out.println("Received order: " + message);
    }
}