package com.example.enjoyTrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.enjoyTrip.dto.UserDto;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String main() {
		return "index.html";
	}
	
	@PostMapping("/login")
	public String login(UserDto dto) {
		
		return "login.html";
	}
	
	@PostMapping("/logout")
	public String logout() {
		return "logout.html";
	}
	
}
