package com.kipper.museumchatbot.controllers;

import com.kipper.museumchatbot.dto.MessageRequest;
import com.kipper.museumchatbot.dto.MessageResponse;
import com.kipper.museumchatbot.services.FaqService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class FaqController {
    final private FaqService faqService;

    public FaqController(FaqService faqService){
        this.faqService = faqService;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> answerQuestion(@RequestBody MessageRequest request){
        String answer = this.faqService.getAnswer(request.message());
        MessageResponse response = new MessageResponse(answer);
        return ResponseEntity.ok(response);
    }
}
