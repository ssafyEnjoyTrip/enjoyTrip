package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.AttractionInfo;
import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttractionInfoRepository extends JpaRepository<AttractionInfo, Integer>{
    List<AttractionInfo> findTop5ByOrderByReadcountDesc();
}
