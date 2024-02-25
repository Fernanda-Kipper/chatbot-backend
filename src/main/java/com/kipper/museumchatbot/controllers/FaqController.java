package com.kipper.museumchatbot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class FaqController {
    @GetMapping
    public ResponseEntity<String> answerQuestion(){
        return ResponseEntity.ok("oi");
    }
}
