package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByNameLike(String keyword);
    User findByEmail(String email);
}
