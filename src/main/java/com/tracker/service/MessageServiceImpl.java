package com.tracker.service;

import com.tracker.config.RabbitMQConfig;
import com.tracker.exceptions.EmptyMessageException;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private RabbitTemplate template;

    @Override
    public void sendMsg(String msg) {

        String message = Optional.ofNullable(msg)
                .orElseThrow(() -> new EmptyMessageException("No message Available"));
//        publish msg
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, message);
    }

}
