package com.example.enjoyTrip.controller;

import java.util.List;

import com.example.enjoyTrip.dto.AttractionParamDto;
import com.example.enjoyTrip.dto.AttractionResultDto;
import com.example.enjoyTrip.dto.SummaryAttractionDto;
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

    private final AttractionService attractionService;

    @GetMapping
    public AttractionResultDto attractionList(AttractionParamDto attractionParamDto){
        if( attractionParamDto.getSearchWord() != null ) {
            return attractionService.findByTitleLike(attractionParamDto);
        }else {
            return attractionService.findAll(attractionParamDto);
        }
    }

    @GetMapping("/{attractionId}")
    public AttractionInfo attractionDetail(@PathVariable int attractionId){
        return attractionService.detail(attractionId);
    }

    @GetMapping("/readCount")
    public List<AttractionInfo> attractionListCount(){
        return attractionService.readCountTop5List();
    }

    @GetMapping("/randomAttraction")
    public List<SummaryAttractionDto> randomAttraction(){
        return attractionService.randomAttraction();
    }
}
