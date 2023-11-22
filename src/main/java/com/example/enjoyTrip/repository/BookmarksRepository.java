package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.Bookmarks;
import com.example.enjoyTrip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookmarksRepository extends JpaRepository<Bookmarks, Integer> {
    Bookmarks findByUserUserIdAndAttractionId(Integer userId, Integer attractionId);
    List<Bookmarks> findAllByUser(User user);
    void deleteByUserUserIdAndAttractionId(int userId, int attractionId);

}
