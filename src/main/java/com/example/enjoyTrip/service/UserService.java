package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.MyPageResultDto;
import com.example.enjoyTrip.dto.UserDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();
    User detail(int memberId);
    List<User> findByNameLike(String keyword);
    User findByEmail(String Email);
    String join(UserDto dto);

    MyPageResultDto mypage(int userId);

    String updateProfile(int userId, UserDto user);

    String checkPassword(UserDto dto);

    String delete(int userId);
}
