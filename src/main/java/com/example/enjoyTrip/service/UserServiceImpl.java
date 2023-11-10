package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.UserDto;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

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

}
