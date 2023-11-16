package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.MyPageAttractionDto;
import com.example.enjoyTrip.dto.MyPageResultDto;
import com.example.enjoyTrip.dto.UserDto;
import com.example.enjoyTrip.entity.AttractionInfo;
import com.example.enjoyTrip.entity.Bookmarks;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.AttractionInfoRepository;
import com.example.enjoyTrip.repository.BookmarksRepository;
import com.example.enjoyTrip.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BookmarksRepository bookmarksRepository;
    private final AttractionInfoRepository attractionInfoRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User detail(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public List<User> findByNameLike(String keyword) {
        return userRepository.findByNameLike(keyword);
    }

    @Override
    public User findByEmail(String email) {
        userRepository.findByEmail(email);
        return null;
    }

    @Override
    public String join(UserDto dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setRole("ROLE_USER");
        user.setPassword(dto.getPassword());
        user.setPhoneNum(dto.getPhoneNum());
        try {
            User enrolled = userRepository.save(user);
            if (enrolled != null) {
                return "success";
            } else {
                return "failed";
            }
        } catch (DataIntegrityViolationException ex) {
            // 예외 처리: 데이터베이스 제약 조건 위반 등의 오류
            return "failed";
        }
    }

    @Override
    public MyPageResultDto mypage(int userId) {
        MyPageResultDto dto = new MyPageResultDto();
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("해당 유저가 없습니다"));
        List<Bookmarks> bookmarksList = bookmarksRepository.findAllByUser(user);
        List<MyPageAttractionDto> list = new ArrayList<>();
        // 북마크 마다 attractionId가 있는데 그걸로 attractionInfo에서 뒤져서 정보 가져오기.
        for (Bookmarks bookmarks : bookmarksList) {
            int attractionId = bookmarks.getAttractionId();
            AttractionInfo attraction = attractionInfoRepository.findById(attractionId).orElseThrow(() -> new RuntimeException(attractionId + "에 해당하는 관광지가 없습니다"));
            MyPageAttractionDto myPageAttractionDto = new MyPageAttractionDto(attraction.getTitle(), attraction.getFirstImage());
            list.add(myPageAttractionDto);
        }
        dto.setBookMarkAttractionList(list);

        return dto;
    }

}
