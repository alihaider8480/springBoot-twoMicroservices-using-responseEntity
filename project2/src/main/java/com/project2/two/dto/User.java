package com.project2.two.dto;

import org.springframework.stereotype.Service;

@Service
public class User 
{
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("project 2 Id is : "+id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("project 2 Name is : "+name+" Haider");
		this.name = name+" Haider";
	}
	
	
}
