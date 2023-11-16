package com.example.enjoyTrip.controller;

import com.example.enjoyTrip.dto.UserDto;
import com.example.enjoyTrip.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

	private final UserService service;

	private final BCryptPasswordEncoder bCryptPasswordEncoder; // 비밀번호 암호화
	@GetMapping("/")
	public String main() {

		return "index.html";
	}
	@GetMapping("/logoutSuccess")
	@ResponseBody
	public String logoutSuccess(){
		return "success";
	}

	@GetMapping("/loginForm")
	public String login() {
		return "login.html";
	}

	@PostMapping("/join")
	@ResponseBody
	public String join(@RequestBody UserDto user) {
		user.setRole("ROLE_USER");
		String rawPassword = user.getPassword();
		// 시큐리티를 사용해서 로그인 할려면 암호화된 비밀번호를 사용해야함. 그래서 암호화 작업 필요
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		System.out.println(user);
		service.join(user);
		return "success";
	}
	
}
