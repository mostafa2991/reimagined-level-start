package com.tracker.controller;

import com.tracker.service.MessageService;
import com.tracker.util.EmailUtilImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/msg")
@AllArgsConstructor
public class MessageController {

    private final MessageService messageService;
//    remove
private final EmailUtilImpl emailUtilImpl;


    @GetMapping({"/sendMsg","/sendMsg/{msg}"})
    public ResponseEntity<String> sendMsg(@PathVariable (required = false) String msg) {

        messageService.sendMsg(msg);
        return ResponseEntity.ok("success send message");

    }
//    @GetMapping("/sendmail")
//    public ResponseEntity<String> sendmail() {
//
//        emailUtilImpl.sendEmail("mostafa.mm661@gmail.com");
//        return ResponseEntity.ok("success send message");
//
//    }
}

