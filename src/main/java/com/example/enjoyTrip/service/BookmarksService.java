package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.BookMarkAttractionDto;

public interface BookmarksService {
    BookMarkAttractionDto findByUserIdAndAttractionId(Integer userId, Integer attractionId);
    void save(BookMarkAttractionDto dto);

    void deleteBookmarks(int userId, int attractionId);
}
