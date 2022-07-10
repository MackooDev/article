package com.example.article.domain.model;

import lombok.Builder;
import lombok.Getter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class Article {

    private UUID id;
    private String contents;
    private LocalDateTime localDateTime;
    private String name;
    private String author;
    private Timestamp timestamp;

}
