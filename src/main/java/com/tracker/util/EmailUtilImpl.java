package com.tracker.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class EmailUtilImpl {

    @Autowired
    private JavaMailSender sender;


    public void sendEmail(String toAddress , String body) {
        MimeMessage message = sender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setTo(toAddress);
            helper.setSubject("message send success");
            helper.setText(body);
            sender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }

}
