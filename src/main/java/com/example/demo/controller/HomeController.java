package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String getHomePage()
	{
		String msg="<h1 style='text-align:center;color:red'>Welcome To Home Page</h1><hr/>";
		return msg;
	}
	
}
