package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.AttractionDto;
import com.example.enjoyTrip.repository.AttractionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttractionServiceImpl implements AttractionService{

    AttractionRepository attractionRepository;

    @Override
    public List<AttractionDto> list() {
        return attractionRepository.findAll();
    }
}
