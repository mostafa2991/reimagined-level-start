package com.tracker.consumer;

import com.tracker.config.RabbitMQConfig;
import com.tracker.util.EmailUtilImpl;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Consumer {

    private final EmailUtilImpl emailUtilImpl;

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(String message) {
//        send to an email
        System.out.println("Message received from queue : " + message);
        emailUtilImpl.sendEmail("hossamadel94@gmail.com",message);
    }
}
