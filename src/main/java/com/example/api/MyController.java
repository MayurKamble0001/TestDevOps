package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path="/user")
	public String Welcome()
	{
		return "Hi there";
	}

}
