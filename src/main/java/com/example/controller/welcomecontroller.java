package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomecontroller {

	@GetMapping("/welcome")
	public String welcome()
	{
		String msg="Welcome";
		return "welcome";
		
	}
}
