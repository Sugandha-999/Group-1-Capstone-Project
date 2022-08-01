package com.DoConnect.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoConnect.dto.EmailMessage;
import com.DoConnect.services.EmailSenderService;

@RestController
public class EmailController {
	
	 private final EmailSenderService emailSenderService;

	    public EmailController(EmailSenderService emailSenderService) {
	        this.emailSenderService = emailSenderService;
	    }

	    @PostMapping("/send-email")
	    public EmailMessage sendEmail(@RequestBody EmailMessage emailMessage) {
	        this.emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
	        return new EmailMessage();
	    }


}
