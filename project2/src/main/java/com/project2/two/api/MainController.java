package com.project2.two.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project2.two.dto.User;

@RestController
public class MainController 
{
	@Autowired
	User user;
	
	@GetMapping("/")
	public ResponseEntity<User> second()
	{
		ResponseEntity<User> responseEntity=null;
		try
		{
			System.out.println("Project 2 is Started");
		    responseEntity = new RestTemplate().getForEntity("http://localhost:8081/", User.class);
			System.out.println("Project 2 Called Project 1 and response Entity data is : "+responseEntity);
			return  responseEntity;
		}
		catch (Exception e) 
		{
			System.out.println("Exception Generated");
			return  responseEntity;
		}
	}
}