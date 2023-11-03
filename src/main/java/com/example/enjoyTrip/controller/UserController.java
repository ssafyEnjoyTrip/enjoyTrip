package com.example.enjoyTrip.controller;

import java.util.List;

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
import com.example.enjoyTrip.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}

	@GetMapping("/")
	public List<UserDto> list() {
		return service.userList();
	}
	
	@GetMapping("/{userId}")
	public UserDto detail(@PathVariable String userId) {
		return service.userDetail(userId);
	}
	
	@PostMapping("/")
	public int insert(UserDto dto) {
		return service.userInsert(dto);
	}
	
	@PutMapping("/{userId}")
	public int update(@PathVariable String userId, UserDto dto) {
		return service.userUpdate(dto);
	}
	
	@DeleteMapping("/{userId}")
	public int delete(@PathVariable String userId) {
		return service.userDelete(userId);
	}
	
//	@GetMapping("/likeList")
//	public List<AttractionDto> likeList(int userId){
//		return ;
//	}
	
//	@GetMapping("/subscribeList")
//	public List<AttractionDto> subscribeList(int userId){
////		List<AttractionDto> aList = service.subscribeList;
//		return null;
//	}
	
	
	
}
