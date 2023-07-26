package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.ArticleDTO;
import com.nazarko.rateitspring.models.Article;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ArticleDTOMapper implements Function<Article, ArticleDTO> {

    UserDTOMapper userDTOMapper = new UserDTOMapper();

    @Override
    public ArticleDTO apply(Article article) {
        return new ArticleDTO(
                article.getId(),
                article.getText(),
                article.getSubject(),
                article.getCreatedAt(),
                userDTOMapper.apply(article.getUser())
        );
    }
}
