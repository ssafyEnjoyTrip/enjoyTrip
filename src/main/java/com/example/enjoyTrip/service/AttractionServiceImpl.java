package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.*;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.AttractionDetail;
import com.example.enjoyTrip.entity.AttractionInfo;
import com.example.enjoyTrip.repository.AttractionInfoRepository;
import com.example.enjoyTrip.repository.AttractionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AttractionServiceImpl implements AttractionService{

    private final int SUCCESS = 1;
    private final int FAIL = -1;


    private final AttractionRepository attractionRepository;
    private final AttractionInfoRepository attractionInfoRepository;

    @Override
    public AttractionResultDto findAll(AttractionParamDto attractionParamDto) {
        AttractionResultDto dto = new AttractionResultDto();

        try {
            int page = attractionParamDto.getOffset() / attractionParamDto.getLimit();
            Pageable pageable = PageRequest.of(page, attractionParamDto.getLimit());

            Page<AttractionInfo> attractionPage = attractionInfoRepository.findAll(pageable);
            List<AttractionInfo> content = attractionPage.getContent();
            int count = (int) attractionRepository.count();
            dto.setList(content);
            dto.setCount(count);
            dto.setResult(SUCCESS);

        }catch(Exception e) {
            e.printStackTrace();
            dto.setResult(FAIL);
        }

        return dto;
    }

    @Override
    public AttractionResultDto findByTitleLike(AttractionParamDto attractionParamDto) {
        AttractionResultDto dto = new AttractionResultDto();

        try {
            String searchWord = attractionParamDto.getSearchWord();
            int page = attractionParamDto.getOffset() / attractionParamDto.getLimit();
            Pageable pageable = PageRequest.of(page, attractionParamDto.getLimit());

            Page<AttractionInfo> attractionPage = attractionInfoRepository.findBySearchWord(searchWord, pageable);
            List<AttractionInfo> content = attractionPage.getContent();

            long totalCount = attractionPage.getTotalElements();
            dto.setList(content);
            dto.setCount((int) totalCount);
            dto.setResult(SUCCESS);

        }catch(Exception e) {
            e.printStackTrace();
            dto.setResult(FAIL);
        }

        return dto;
    }

    @Override
    public List<AttractionDetail> list() {
        return attractionRepository.findAll();
    }

    @Override
    public AttractionInfo detail(int attractionId) {
        return attractionInfoRepository.findById(attractionId).orElse(null);
    }

    @Override
    public List<AttractionInfo> readCountTop5List() {
        return attractionInfoRepository.findTop5ByOrderByReadcountDesc();
    }

    @Override
    public List<SummaryAttractionDto> randomAttraction() {
        List<AttractionInfo> attractionInfos= attractionInfoRepository.randomRecommendAttraction();
        List<SummaryAttractionDto> dtos = new ArrayList<>();

        for(AttractionInfo info : attractionInfos){
            dtos.add(SummaryAttractionDto.builder()
                    .attractionId(info.getAttractionId())
                    .firstImage(info.getFirstImage())
                    .title(info.getTitle())
                    .build());
        }
        return dtos;
    }

}
