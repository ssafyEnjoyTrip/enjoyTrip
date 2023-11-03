package com.example.enjoyTrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.enjoyTrip.dto.AttractionDto;

@Mapper
public interface AttractionDao {
	List<AttractionDto> list();
	List<AttractionDto> search(String keyword);
	AttractionDto detail(int contentId);
	int update(AttractionDto Dto);
	int delete(int contentId);
	List<AttractionDto> sortByReadCount();
	List<AttractionDto> sortByCreatedTime();
}
