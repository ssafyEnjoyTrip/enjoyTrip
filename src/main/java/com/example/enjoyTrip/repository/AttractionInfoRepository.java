package com.example.enjoyTrip.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.enjoyTrip.entity.AttractionInfo;

public interface AttractionInfoRepository extends JpaRepository<AttractionInfo, Integer>{

    List<AttractionInfo> findTop5ByOrderByReadcountDesc();



    // 검색어(searchWord)에 맞춰서 페이징 처리된 어트랙션 목록을 가져오는 쿼리
    @Query(value = "SELECT a FROM AttractionInfo a WHERE " +
            "(:searchWord IS NULL OR a.title LIKE %:searchWord%)")
    Page<AttractionInfo> findBySearchWord(@Param ("searchWord") String searchWord, Pageable pageable);



    @Query(value="SELECT * FROM attraction_info  order by RAND() LIMIT 6", nativeQuery = true)
    List<AttractionInfo> randomRecommendAttraction();
}
