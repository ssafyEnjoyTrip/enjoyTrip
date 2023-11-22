package com.example.enjoyTrip.dto;

import com.example.enjoyTrip.entity.Bookmarks;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookMarkAttractionDto {
    private int attractionId;
    private int userId;
    List<Bookmarks> bookmarks;

}
