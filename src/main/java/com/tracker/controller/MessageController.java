package com.tracker.controller;

import com.tracker.service.MessageService;
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


    @GetMapping({"/sendMsg","/sendMsg/{msg}"})
    public ResponseEntity<String> sendMsg(@PathVariable (required = false) String msg) {

        messageService.sendMsg(msg);
        return ResponseEntity.ok("success send message");

    }
}

