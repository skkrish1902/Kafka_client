package com.kafka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String getWelcome() {
		
		return "Welcome to the client application";
	}
	
	

}
