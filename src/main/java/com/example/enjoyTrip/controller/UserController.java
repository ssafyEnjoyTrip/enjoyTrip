package com.example.enjoyTrip.controller;

import java.util.List;

import com.example.enjoyTrip.dto.MyPageResultDto;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.enjoyTrip.dto.AttractionDto;
import com.example.enjoyTrip.dto.UserDto;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;

	@GetMapping("/myPage/{userId}")
	@ResponseBody
	public MyPageResultDto myPage(@PathVariable int userId){
		return service.mypage(userId);
	}

	@PutMapping("/{userId}")
	@ResponseBody
	public String updateProfile(@PathVariable int userId, @RequestBody UserDto user){
		return service.updateProfile(userId, user);
	}

	@PostMapping("/checkPassword")
	@ResponseBody
	public String checkPassword(@RequestBody UserDto user){
		return service.checkPassword(user);
	}

	@DeleteMapping("/{userId}")
	@ResponseBody
	public String delete(@PathVariable int userId) {
		return service.delete(userId);
	}

	@GetMapping("/check")
	@ResponseBody
	public int check(){
		return service.getUserId();
	}
	
}
