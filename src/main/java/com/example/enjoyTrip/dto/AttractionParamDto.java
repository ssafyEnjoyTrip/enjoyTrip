package com.example.enjoyTrip.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttractionParamDto {
    private int limit;
    private int offset;
    private String searchWord;
}
