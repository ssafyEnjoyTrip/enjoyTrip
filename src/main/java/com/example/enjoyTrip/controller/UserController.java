package com.example.enjoyTrip.controller;

import java.util.List;

import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.AttractionDto;
import com.example.enjoyTrip.dto.UserDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService service;

	@GetMapping("/search/{keyword}")
	public List<User> search(@PathVariable String keyword){
		return service.findByNameLike("%" + keyword + "%");
	}

	@GetMapping("/interceptTest")
	public String test(HttpSession session) {
		session.setAttribute("user", "Ok");
		return null;
	}
	
	@PostMapping("/")
	public int insert(UserDto dto) {
//		return service.insert(dto);
		return 1;
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
