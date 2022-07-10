package com.example.article.adapters.persistent.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class EntityFields {
    @Id
    private UUID id;
    private String contents;
    private LocalDateTime localDateTime;
    private String name;
    private String author;
    private Timestamp timestamp;
}
