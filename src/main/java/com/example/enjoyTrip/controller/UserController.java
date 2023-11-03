//package com.example.enjoyTrip.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.enjoyTrip.dto.AttractionDto;
//import com.example.enjoyTrip.dto.UserDto;
//import com.example.enjoyTrip.service.UserService;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//	
//	@Autowired
//	UserService service;
//	
//	@GetMapping("/")
//	public String test() {
//		return null	;
//	}
//	
//	@PostMapping("/")
//	public int insert(UserDto dto) {
////		return service.insert(dto);
//		return 1;
//	}
//	
//	@PutMapping("/{userId}")
//	public int update(@PathVariable int userId, UserDto dto) {
////		return service.update(dto);
//		return 1;
//	}
//	
//	@DeleteMapping("/{userId}")
//	public int delete(@PathVariable int userId) {
////		return service.delete(userId);
//		return 1;
//	}
//	
//	@GetMapping("/likeList")
//	public List<AttractionDto> likeList(int userId){
////		List<AttractionDto> aList = service.likeList(userId);
//		return null;
//	}
//	
//	@GetMapping("/subscribeList")
//	public List<AttractionDto> subscribeList(int userId){
////		List<AttractionDto> aList = service.subscribeList;
//		return null;
//	}
//	
//	
//	
//}
