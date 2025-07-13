package com.email.writer.controller;

import com.email.writer.request.EmailRequest;
import com.email.writer.service.EmailGenerateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    private final EmailGenerateService emailGenerateService;
    @PostMapping("/generate")
    public ResponseEntity<String> generateEmailReply(@RequestBody EmailRequest emailRequest){
        String response = emailGenerateService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }

}
