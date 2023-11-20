package com.example.enjoyTrip.dto;

import com.example.enjoyTrip.entity.Bookmarks;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MyPageResultDto {

    private List<MyPageAttractionDto> bookMarkAttractionList;
}