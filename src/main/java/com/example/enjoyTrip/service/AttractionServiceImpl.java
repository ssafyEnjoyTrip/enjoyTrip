package com.example.enjoyTrip.service;

import com.example.enjoyTrip.entity.AttractionDetail;
import com.example.enjoyTrip.entity.AttractionInfo;
import com.example.enjoyTrip.repository.AttractionInfoRepository;
import com.example.enjoyTrip.repository.AttractionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttractionServiceImpl implements AttractionService{

    private final AttractionRepository attractionRepository;
    private final AttractionInfoRepository attractionInfoRepository;

    @Override
    public List<AttractionDetail> list() {
        return attractionRepository.findAll();
    }

    @Override
    public AttractionDetail detail(int contentId) {
        return attractionRepository.findById(contentId).orElse(null);
    }

    @Override
    public List<AttractionInfo> readCountTop5List() {
        return attractionInfoRepository.findTop5ByOrderByReadcountDesc();
    }
}
