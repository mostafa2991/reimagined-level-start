package com.tracker.config;


import com.tracker.service.DirectMessage;
import com.tracker.service.MessageSender;
import com.tracker.service.MsgQueMessage;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean(name = "directMessage")
    @ConditionalOnProperty(prefix = "message", name = "service", havingValue = "direct")
    public MessageSender directMessage() {
        return new DirectMessage();
    }

    @Bean(name = "msgQueMessage")
    @ConditionalOnProperty(prefix = "message", name = "service", havingValue = "msgQue")
    public MessageSender msgQueMessage() {
        return new MsgQueMessage();
    }
}
