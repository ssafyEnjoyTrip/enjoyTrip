package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.AttractionInfo;
import com.example.enjoyTrip.entity.User;
import lombok.ToString;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttractionInfoRepository extends JpaRepository<AttractionInfo, Integer>{

    // 검색어(searchWord)에 맞춰서 페이징 처리된 어트랙션 목록을 가져오는 쿼리
    @Query(value = "SELECT a FROM AttractionInfo a WHERE " +
            "(:searchWord IS NULL OR a.title LIKE %:searchWord%)")
    Page<AttractionInfo> findBySearchWord(String searchWord, Pageable pageable);

    List<AttractionInfo> findTop5ByOrderByReadcountDesc();


}
