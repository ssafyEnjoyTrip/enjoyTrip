package com.example.enjoyTrip.service;

import com.example.enjoyTrip.entity.AttractionDetail;

import java.util.List;

public interface AttractionService {

    List<AttractionDetail> list();
    AttractionDetail detail(int contentId);
}
