package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.AttractionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<AttractionDetail, Integer> {


}
