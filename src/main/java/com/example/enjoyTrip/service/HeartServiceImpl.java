package com.example.enjoyTrip.service;

import com.example.enjoyTrip.config.auth.PrincipalDetails;
import com.example.enjoyTrip.dto.HeartDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.Heart;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.ArticleRepository;
import com.example.enjoyTrip.repository.HeartRepository;
import com.example.enjoyTrip.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class HeartServiceImpl implements HeartService{

    private final HeartRepository heartRepository;
    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;

    @Override
    @Transactional
    public Heart insert(int articleId) {
        // 유저 가져오기
        User user = getUser();
        // 게시글 가져오기
        Article article = articleRepository.findById(articleId).orElseThrow(() -> new RuntimeException("게시글 정보가 없습니다"));

        Heart heart = new Heart();
        heart.setArticle(article);
        heart.setUser(user);

        return heartRepository.save(heart);
    }

    @Override
    @Transactional
    public void delete(int articleId) {
        // 유저 가져오기
        User user = getUser();
        // 게시글 가져오기
        Article article = articleRepository.findById(articleId).orElseThrow(() -> new RuntimeException("게시글 정보가 없습니다"));

        Heart heart = heartRepository.findByUserAndArticle(user, article);
        if( heart != null){ // heart가 있으면 지우자
            heartRepository.delete(heart);
        }
    }

    @Override
    public boolean check(int articleId) {
        // 유저 가져오기
        User user = getUser();
        // 게시글 가져오기
        Article article = articleRepository.findById(articleId).orElseThrow(() -> new RuntimeException("게시글 정보가 없습니다"));

        Heart heart = heartRepository.findByUserAndArticle(user, article);
        if( heart != null) return true;
        else return false;
    }




    public User getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        int userId = ((PrincipalDetails) authentication.getPrincipal()).getUserId(); // 현재 로그인한 회원 id
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("로그인 유저 정보가 없습니다"));
    }
}
