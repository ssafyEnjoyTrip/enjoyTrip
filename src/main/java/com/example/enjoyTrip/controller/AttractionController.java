package com.example.enjoyTrip.controller;

import com.example.enjoyTrip.dto.AttractionDto;
import com.example.enjoyTrip.entity.AttractionDetail;
import com.example.enjoyTrip.service.AttractionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attractions")
@RequiredArgsConstructor
public class AttractionController {

    private final AttractionService service;

    @GetMapping("/")
    public List<AttractionDetail> attractionList(){
        return service.list();
    }

    @GetMapping("/{contentId}")
    public AttractionDetail attractionDetail(@PathVariable int contentId){
        return service.detail(contentId);
    }

    @
}
