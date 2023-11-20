package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.Heart;
import com.example.enjoyTrip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRepository extends JpaRepository<Heart, Integer> {
    Heart findByUserAndArticle(User user, Article article);
}
