package com.backend.backend.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/v1/article")
public class ArticleController {
        private final ArticleService articleService;
    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping
    public List<Article> getArticle(){
        return articleService.getArticle();
    }
    @GetMapping(path="{articleId}")
    public Optional<Article> getArticleById(@PathVariable("articleId") Long articleId){
        return articleService.getArticleById(articleId);
    }
    @PostMapping
    public void registerNewArticle(@RequestBody Article article){
        articleService.addNewArticle(article);
    }
    @DeleteMapping(path ="{articleId}")
    public void deleteArticle(@PathVariable("articleId") Long articleId){
        articleService.deleteArticle(articleId);
    }
    @PutMapping(path="{articleId}")
    public void updateArticle(
            @PathVariable("articleId") Long articleId,
            @RequestParam(required = false) String artist){
        articleService.updateArticle(articleId,artist);
    }
}
