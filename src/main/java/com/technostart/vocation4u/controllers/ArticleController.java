package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.Article;
import com.technostart.vocation4u.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping()
    public ArrayList<Article> getArticles(){
        return articleService.getArticles();
    }

    @GetMapping(path ="/{id}")
    public Optional<Article> getArticleById(@PathVariable("id") Long id){
        return this.articleService.getById(id);
    }

    @GetMapping("/query")
    public ArrayList<Article> getBySpecialistId (@RequestParam("specialistId") Integer specialistId){
        return this.articleService.getBySpecialistId(specialistId);
    }

    @PostMapping()
    public Article postArticle(@RequestBody Article article){
        return this.articleService.postArticle(article);
    }
}
