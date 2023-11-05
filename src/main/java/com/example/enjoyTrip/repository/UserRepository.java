package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
