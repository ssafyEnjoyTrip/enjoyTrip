package com.example.enjoyTrip.controller;

import com.example.enjoyTrip.dto.HeartDto;
import com.example.enjoyTrip.service.HeartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hearts")
@RequiredArgsConstructor
public class HeartController {

    private final HeartService heartService;

    @PostMapping("/{articleId}")
    public String createHeart(@PathVariable int articleId){
        heartService.insert(articleId);

        return "success";
    }

    @DeleteMapping("/{articleId}")
    public String deleteHeart(@PathVariable int articleId){
        heartService.delete(articleId);

        return "success";
    }


    @PostMapping("/check/{articleId}")
    public Boolean checkRecommendations(@PathVariable int articleId) {
        return heartService.check(articleId);
    }


}
