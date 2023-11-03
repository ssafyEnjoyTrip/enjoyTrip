package com.example.enjoyTrip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.enjoyTrip.dao.AttractionDao;
import com.example.enjoyTrip.dto.AttractionDto;
@Service
public class AttractionServiceImpl implements AttractionService{

	private final AttractionDao dao;

	public AttractionServiceImpl(AttractionDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<AttractionDto> list() {
		return dao.list();
	}

	@Override
	public List<AttractionDto> search(String keyword) {
		return dao.search(keyword);
	}

	@Override
	public AttractionDto detail(int contentId) {
		return dao.detail(contentId);
	}

	@Override
	public int update(AttractionDto Dto) {
		return dao.update(Dto);
	}

	@Override
	public int delete(int contentId) {
		return dao.delete(contentId);
	}

	@Override
	public List<AttractionDto> sortByReadCount() {
		return dao.sortByReadCount();
	}

}
