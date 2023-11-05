package com.example.enjoyTrip.service;

import com.example.enjoyTrip.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();
    User detail(int memberId);

}
