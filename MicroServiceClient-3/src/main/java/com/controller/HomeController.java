package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/getPro")
	public String preLogin()
	{
		return "Welcome Client Event";
	}

}
