package com.project1.one.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project1.one.dto.User;

@RestController
public class Mainapi 
{
	@Autowired
	User user;
	
	@GetMapping("/")
	public User second()
	{
		System.out.println("Project 1 is Started");
		System.out.println("Project 2 is Calling Project1");
		user.setId(1);
		user.setName("Ali");
		return user;
	}
}
