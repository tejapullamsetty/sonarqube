package com.example.sonareexample.service;

import org.springframework.stereotype.Service;

@Service
public class SonarQubeService {
	
	public String sonarExample() {
		String str="Hello this is sonarQube Example";
		Object obj=getObject();
		return str+obj;
	}
	
	public Object getObject() {
		return "Hello";
	}

}
