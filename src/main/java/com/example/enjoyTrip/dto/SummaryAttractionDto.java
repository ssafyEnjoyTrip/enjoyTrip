package com.example.enjoyTrip.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SummaryAttractionDto {
    private int attractionId;
    private String title;
    private String firstImage;
}
