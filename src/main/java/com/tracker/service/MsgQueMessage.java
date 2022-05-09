package com.tracker.service;

import com.tracker.config.RabbitMQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@Slf4j
public class MsgQueMessage implements MessageSender {

    private RabbitTemplate template;

    @Override
    public void sendMsg(String message) {

        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, message);
    }

}
