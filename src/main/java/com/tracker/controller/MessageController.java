package com.tracker.controller;

import com.tracker.dto.MessageDto;
import com.tracker.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/msg")
@AllArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping({"/sendMsg","/sendMsg/{message}"})
    public ResponseEntity<String> sendMsgUrl(@PathVariable (required = false) String message) {

        messageService.sendMsgUrl(message);
        return ResponseEntity.ok("message sent successfully");

    }

    @PostMapping("/sendMsg")
    public ResponseEntity<String> sendMsgBody(@Valid @RequestBody MessageDto messageDto) {

        messageService.sendMsgBody(messageDto);
        return ResponseEntity.ok("message sent successfully");

    }
}
