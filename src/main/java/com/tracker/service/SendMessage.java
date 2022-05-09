package com.tracker.service;

import com.tracker.dto.MessageDto;
import com.tracker.exceptions.EmptyMessageException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Slf4j
@Service
@AllArgsConstructor
public class SendMessage implements MessageService {

    private final MessageSender messageSender;

    @Override
    public void sendMsgUrl(String message) {

        Optional.ofNullable(message)
                .orElseThrow(() -> {
                    log.error("No message provided");
                    return new EmptyMessageException("No message Available");
                });
        messageSender.sendMsg(message);
    }

    @Override
    public void sendMsgBody(MessageDto messageDto) {

        Optional.ofNullable(messageDto)
                .orElseThrow(() -> {
                    log.error("No message provided");
                    return new EmptyMessageException("No message Available");
                });
        messageSender.sendMsg(messageDto.getMessage());
    }

}
