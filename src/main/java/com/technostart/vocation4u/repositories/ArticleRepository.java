package com.technostart.vocation4u.repositories;

import com.technostart.vocation4u.models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ArticleRepository extends CrudRepository <Article, Long> {
    public abstract ArrayList<Article> findBySpecialistId(Integer specialistId);
}
