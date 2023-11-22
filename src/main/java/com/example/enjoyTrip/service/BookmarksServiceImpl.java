package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.BookMarkAttractionDto;
import com.example.enjoyTrip.entity.Bookmarks;
import com.example.enjoyTrip.repository.BookmarksRepository;
import com.example.enjoyTrip.repository.UserRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import com.example.enjoyTrip.entity.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BookmarksServiceImpl implements BookmarksService{

    private final BookmarksRepository bookmarksRepository;
    @Override
    public BookMarkAttractionDto findByUserIdAndAttractionId(Integer userId, Integer attractionId) {
        Bookmarks bookmarks = bookmarksRepository.findByUserUserIdAndAttractionId(userId, attractionId);
        BookMarkAttractionDto dto = null;
        try{
            dto = BookMarkAttractionDto.builder().
                    attractionId(attractionId)
                    .userId(userId) // SessionStorage에서 가져온 userId 그대로 사용
                    .bookmarks(new ArrayList<>(bookmarks.getId()))
                    .build();
        } catch(NullPointerException e){
            return null;
        }
        return dto;
    }



    @Override
    public void save(BookMarkAttractionDto dto) {
        Bookmarks bookmarks =   Bookmarks.builder()
                                .id(dto.getUserId())
                                .attractionId(dto.getAttractionId())
                                .user(User.builder()
                                    .userId(dto.getUserId())
                                    .build())
                                .build();
        bookmarksRepository.save(bookmarks);
    }
    @Transactional
    @Override
    public void deleteBookmarks(int userId, int attractionId) {
        bookmarksRepository.deleteByUserUserIdAndAttractionId(userId, attractionId);
    }

}
