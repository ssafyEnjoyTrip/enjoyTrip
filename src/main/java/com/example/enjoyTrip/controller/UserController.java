package com.example.enjoyTrip.controller;

import java.util.List;

import com.example.enjoyTrip.config.auth.PrincipalDetails;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.enjoyTrip.dto.AttractionDto;
import com.example.enjoyTrip.dto.UserDto;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins="*", allowedHeaders = "*")
public class UserController {

	private final UserService service;

	private final BCryptPasswordEncoder bCryptPasswordEncoder; // 비밀번호 암호화

	@GetMapping("/id")
	@ResponseBody
	public int userName(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		int userId = ((PrincipalDetails) authentication.getPrincipal()).getUserId();
		System.out.println(userId);
		return userId;
	}

	@GetMapping("/search/{keyword}")
	@ResponseBody
	public List<User> search(@PathVariable String keyword){
		return service.findByNameLike("%" + keyword + "%");
	}

	@GetMapping("/interceptTest")
	public String test(HttpSession session) {
		session.setAttribute("user", "Ok");
		return null;
	}
	

	
	@PutMapping("/{userId}")
	public int update(@PathVariable int userId, UserDto dto) {
//		return service.update(dto);
		return 1;
	}
	
	@DeleteMapping("/{userId}")
	public int delete(@PathVariable int userId) {
//		return service.delete(userId);
		return 1;
	}
	
	@GetMapping("/likeList")
	public List<AttractionDto> likeList(int userId){
//		List<AttractionDto> aList = service.likeList(userId);
		return null;
	}
	
	@GetMapping("/subscribeList")
	public List<AttractionDto> subscribeList(int userId){
//		List<AttractionDto> aList = service.subscribeList;
		return null;
	}
	
	
	
}
