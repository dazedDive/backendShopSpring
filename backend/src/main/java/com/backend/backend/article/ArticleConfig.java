package com.backend.backend.article;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ArticleConfig {
    @Bean
    CommandLineRunner commandLineRunner(ArticleRepository articleRepository){
        return args ->{
            Article Slayer1 = new Article(
                    1L,
                    "Slayer",
                    "Season in the Abyss",
                    3,
                    19.99,
                    'D');
            Article Darkthrone1= new Article(
                    2L,
                    "Darkthrone",
                    "Old Star",
                    2,
                    22.99,
                    'B');
            articleRepository.saveAll(
                    List.of(Slayer1,Darkthrone1)
            );
        };


    }
}
