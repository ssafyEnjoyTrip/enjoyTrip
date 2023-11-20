package com.example.enjoyTrip.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.entity.AttractionDetail;
import com.example.enjoyTrip.entity.AttractionInfo;
import com.example.enjoyTrip.repository.AttractionInfoRepository;
import com.example.enjoyTrip.repository.AttractionRepository;
import com.example.enjoyTrip.service.AttractionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/attractions")
@RequiredArgsConstructor
public class AttractionController {

    private final AttractionService service;
    private final AttractionInfoRepository attractionInfoRepository;

    @GetMapping("/")
    public Page<AttractionInfo> attractionList(
    		@RequestParam(defaultValue="0") int page,
    		@RequestParam(defaultValue="12") int size
    		){
    	  PageRequest pageRequest = PageRequest.of(page, size);
        return attractionInfoRepository.findAll(pageRequest);
    }

    @GetMapping("/{articleId}")
    public AttractionInfo attractionDetail(@PathVariable int articleId){
        return attractionInfoRepository.findById(articleId).orElse(null);
    }

    @GetMapping("/readCount")
    public List<AttractionInfo> attractionListCount(){
        return service.readCountTop5List();
    }
    
}
