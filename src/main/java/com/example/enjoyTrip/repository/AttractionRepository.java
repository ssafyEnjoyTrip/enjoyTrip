package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.AttractionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttractionRepository extends JpaRepository<AttractionDetail, Integer> {


}
