package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleDAO extends JpaRepository<Article, Integer> {

    List<Article> findByUserId(int id);

    @Query("select a from Article a where a.id=:id")
    Article findById(int id);
}
