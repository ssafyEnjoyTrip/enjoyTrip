package com.example.enjoyTrip.service;


import com.example.enjoyTrip.dto.HeartDto;
import com.example.enjoyTrip.entity.Heart;

public interface HeartService {

    Heart insert(int articleId);
    void delete(int articleId);
    boolean check(int articleId);


}
