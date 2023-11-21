package com.example.enjoyTrip.dto;

import com.example.enjoyTrip.entity.AttractionInfo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttractionResultDto {
    private int result;
    private AttractionInfo attractionInfo; // 상세
    private List<AttractionInfo> list; // 목록 여러건
    private int count; // 총건수
}
