package com.kafka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/welcome")
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcome() {
		
		return "Welcome to the client application";
	}
	
	

}
