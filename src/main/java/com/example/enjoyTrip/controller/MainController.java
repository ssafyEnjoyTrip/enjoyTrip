package com.example.enjoyTrip.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.enjoyTrip.dto.UserDto;
import com.example.enjoyTrip.service.UserService;
import com.mysql.cj.Session;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final UserService service;
	
	
	@GetMapping("/")
	public String main() {
		return "index.html";
	}
	
	@GetMapping("/noLogin")
	@ResponseBody
	public String noLogin() {
		return "로그인 먼저 하세요.";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String login(UserDto dto, HttpSession session) {
		UserDto loginUser = service.loginCheck(dto);
		
		if(loginUser != null) { // 유저 정보가 있으면 세션 저장하기
			
			session.setAttribute("user", loginUser);
			return "로그인 완료!";
		}

		return "회원 정보가 없습니다.";
	}
	
	@PostMapping("/logout")
	@ResponseBody
	public String logout(HttpSession session) {
		session.invalidate();
		return "로그아웃 완료";
	}
	
}
