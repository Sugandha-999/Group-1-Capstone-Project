package com.DoConnect.services;

import org.springframework.stereotype.Service;

@Service
public interface EmailSenderService {
	
     void sendEmail(String to, String subject, String message);
}
