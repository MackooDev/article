package com.example.article.ports;

import com.example.article.domain.model.Article;

import java.util.List;

public interface ArticleService {

    Iterable<Article> getAllArticlePresSortByDatePublicationDescending();

    Article getArticlePresById(Long id);

    List<Article> getAllArticlePresAfterKeyWordContainedInTitleOrContents();

    Article addArticlePres(Article article);

    Article updateArticlePresById(Long id);

    Article removeChosenArticlePresById(Long id);
}
