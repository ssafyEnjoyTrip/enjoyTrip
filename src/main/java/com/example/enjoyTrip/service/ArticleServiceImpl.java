package com.example.enjoyTrip.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.enjoyTrip.config.auth.PrincipalDetails;
import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.ArticleRepository;
import com.example.enjoyTrip.repository.IArticle;
import com.example.enjoyTrip.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

	private final UserRepository userRepository;
	private final ArticleRepository articleRepository;

	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	@Override
	public Article detail(int articleId) {
		return articleRepository.findById(articleId).orElse(null);
	}

	@Override
	@Transactional
	public Article insert(ArticleDto dto) {

		String title = dto.getTitle();
		String content = dto.getContent();
		Article article = new Article();

		User user = getUser();
		System.out.println(user);
		article.setUser(user);
		article.setTitle(title);
		article.setContent(content);

		return articleRepository.save(article);
	}


	@Override
	public List<Article> findByTitleLike(String keyword) {
		return articleRepository.findByTitleLike( "%" + keyword + "%");
	}

	@Override
	public List<IArticle> findList() {
		return articleRepository.findList();
	}

	@Override
	public IArticle singleDetail(int articleId){
		return articleRepository.singleDetail(articleId);
	}

	@Override
	public void deleteById(int articleId) {
		articleRepository.deleteById(articleId);
		
	}


	public User getUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		int userId = ((PrincipalDetails) authentication.getPrincipal()).getUserId(); // 현재 로그인한 회원 id
		return userRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("로그인 유저 정보가 없습니다"));
	}
}
