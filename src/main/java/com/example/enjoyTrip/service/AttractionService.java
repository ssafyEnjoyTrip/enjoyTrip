package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.ArticleParamDto;
import com.example.enjoyTrip.dto.ArticleResultDto;
import com.example.enjoyTrip.dto.AttractionParamDto;
import com.example.enjoyTrip.dto.AttractionResultDto;
import com.example.enjoyTrip.entity.AttractionDetail;
import com.example.enjoyTrip.entity.AttractionInfo;

import java.util.List;

public interface AttractionService {

    AttractionResultDto findAll(AttractionParamDto attractionParamDto);
    AttractionResultDto findByTitleLike(AttractionParamDto attractionParamDto);

    List<AttractionDetail> list();
    AttractionInfo detail(int contentId);
    List<AttractionInfo> readCountTop5List();
}
