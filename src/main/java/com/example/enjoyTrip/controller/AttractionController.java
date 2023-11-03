package com.example.enjoyTrip.controller;

import java.util.List;
 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.AttractionDto;
import com.example.enjoyTrip.service.AttractionService;

@RestController
@RequestMapping("/attraction")
public class AttractionController {
	
	private final AttractionService service;
	
	public AttractionController(AttractionService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public List<AttractionDto> list(){
		return service.list();
	}
	
	@GetMapping("/search/{keyword}")
	public List<AttractionDto> search(@PathVariable String keyword) {
		return service.search(keyword);
	}
	
	@GetMapping("/{contentId}")
	public AttractionDto detail(@PathVariable int contentId, AttractionDto dto) {
		return service.detail(contentId);
	}
	
	@PutMapping("/{contentId}")
	public String update(@PathVariable int contentId, AttractionDto dto) {
		int result = service.update(dto);		
		return result == 1 ? "성공적으로 업데이트 되었습니다." : "업데이트가 실패하였습니다.";
	}
	
	@DeleteMapping("/{contentId}")
	public String delete(@PathVariable int contentId) {
		int result = service.delete(contentId);		
		return result == 1 ? "삭제가 성공적으로 완료되었습니다," : "삭제가 되지 않았습니다.";
	}
	
}
