package com.backend.backend.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getArticle(){
        return articleRepository.findAll();
    }

    public void addNewArticle(Article article) {
        Optional<Article> articleByName = articleRepository.findArticleByName(article.getName());
        if (articleByName.isPresent()){
            throw new IllegalStateException("article allready exist!");
        }
        articleRepository.save(article);
    }

    public void deleteArticle(Long articleId) {
        boolean exist = articleRepository.existsById(articleId);
        if (!exist){
            throw new IllegalStateException("article with this ID doesn't exists");
        }
        articleRepository.deleteById(articleId);
    }

    public Optional<Article> getArticleById(Long articleId) {
        boolean existId = articleRepository.existsById(articleId);
        if (!existId){
            throw new IllegalStateException("article not found");
        }
        return articleRepository.findById(articleId);
    }

    @Transactional
    public void updateArticle(Long articleId,
                              String artist) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(()->new IllegalStateException("this article doen't exist"));
        if (!Objects.equals(article.getArtist(), artist)) {
            article.setArtist(artist);
        };
    }
}
