package com.backend.backend;

import com.backend.backend.article.Article;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class ShopTpApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopTpApplication.class, args);
	}

}
