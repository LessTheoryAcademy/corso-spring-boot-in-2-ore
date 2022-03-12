package com.myphotos.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String index() {
		
		return "admin";
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
}
