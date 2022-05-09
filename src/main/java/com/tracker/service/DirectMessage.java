package com.tracker.service;

import com.tracker.util.EmailUtilImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DirectMessage implements MessageSender {

    private EmailUtilImpl emailUtilImpl;

    @Override
    public void sendMsg(String message) {
        emailUtilImpl.sendEmail("hossamadel94@gmail.com", message);
    }

}
