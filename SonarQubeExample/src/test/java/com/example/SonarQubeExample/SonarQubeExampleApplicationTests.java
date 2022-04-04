package com.example.SonarQubeExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.sonareexample.service.SonarQubeService;

@SpringBootTest
class SonarQubeExampleApplicationTests {
	
	@Autowired
	private SonarQubeService sonarQubeService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void sonarExampleTest() {
		when(sonarQubeService.sonarExample()).thenReturn("Hello this is test case");
		assertEquals("Hello this is test case", "Hello this is test case");	
		
	}

}
