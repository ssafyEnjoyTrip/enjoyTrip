package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.AttractionDto;

public interface AttractionService {
	List<AttractionDto> list();
	List<AttractionDto> search(String keyword);
	AttractionDto detail(int contentId);
	int update(AttractionDto Dto);
	int delete(int contentId);
	List<AttractionDto> sortByReadCount();
	List<AttractionDto> sortByCreatedTime();
}
