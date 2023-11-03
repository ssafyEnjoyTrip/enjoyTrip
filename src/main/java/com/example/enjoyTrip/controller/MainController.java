package com.example.enjoyTrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	//adsfsadasdf
	@GetMapping("/")
	public String main() {
		return "index.html";
	}
	// 메인 컨틀로러 만들었땅
}
