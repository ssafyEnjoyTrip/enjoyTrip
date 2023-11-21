package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.CommentSaveDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.ArticleComment;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.ArticleCommentRepository;
import com.example.enjoyTrip.repository.ArticleRepository;
import com.example.enjoyTrip.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{

    private final ArticleCommentRepository articleCommentRepository;
    private final ArticleRepository articleRepository;
    private final UserRepository userRepository;
    @Override
    public List<ArticleComment> findAll() {
        return articleCommentRepository.findAll();
    }
    public List<ArticleComment>  findByArticleArticleId(int articleId){
        return articleCommentRepository.findByArticleArticleId(articleId);
    }

    @Override
    public ArticleComment insert(CommentSaveDto dto) {
        ArticleComment comment = new ArticleComment();
        Article article = articleRepository.findById(dto.getArticleId()).orElse(null);
        User user = userRepository.findById(dto.getUserId()).orElse(null);
        comment.setArticle(article);
        comment.setUser(user);
        comment.setComment(dto.getComment());
        return articleCommentRepository.save(comment);
    }
}
