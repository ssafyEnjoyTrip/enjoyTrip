package com.example.enjoyTrip.service;

import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User detail(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
