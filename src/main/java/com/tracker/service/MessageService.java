package com.tracker.service;

import com.tracker.dto.MessageDto;

public interface MessageService {

    void sendMsgUrl(String message);
    void sendMsgBody(MessageDto messageDto);
}
