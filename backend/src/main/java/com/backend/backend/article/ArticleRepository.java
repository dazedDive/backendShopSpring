package com.backend.backend.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository
        extends JpaRepository <Article, Long>{

    @Query("SELECT s FROM Article s WHERE s.name = ?1")
    Optional<Article> findArticleByName(String name);

}
