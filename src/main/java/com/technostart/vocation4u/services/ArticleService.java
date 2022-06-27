package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.Article;
import com.technostart.vocation4u.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    public ArrayList<Article> getArticles(){
        return (ArrayList<Article>) articleRepository.findAll();
    }

    public Article postArticle (Article article){
        return articleRepository.save(article);
    }

    public Optional<Article> getById(Long id){
        return articleRepository.findById(id);
    }

    public ArrayList<Article> getBySpecialistId(Integer specialistId){
        return articleRepository.findBySpecialistId(specialistId);
    }
}
