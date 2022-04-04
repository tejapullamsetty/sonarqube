package com.example.sonareexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sonareexample.service.SonarQubeService;

@RestController
@RequestMapping("/sonarQube")
public class SonarQubeController {
	
	@Autowired
	private SonarQubeService sonarQubeService;

	@GetMapping("/")
	public String helloSonar(String name) {
		
		sonarQubeService.sonarExample();
		return "Hello";
	}
}
