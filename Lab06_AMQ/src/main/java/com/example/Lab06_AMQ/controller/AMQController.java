package com.example.Lab06_AMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Lab06_AMQ.service.SendService;

@RestController
public class AMQController {
	@Autowired
	private SendService sendService;
	
	@GetMapping("/send/{mess}")
	public String sendMessage(@PathVariable("mess") String mess)  {
		sendService.sendMess(mess);
		return mess;
	}
}
