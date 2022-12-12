package com.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/")
	public String getDemo() {
		
		return restTemplate.getForObject("http://Kafka-Client-app/clientApp/", String.class);
	}
	
	
	
}
