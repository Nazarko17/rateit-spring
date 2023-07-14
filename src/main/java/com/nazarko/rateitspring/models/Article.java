package com.nazarko.rateitspring.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "user")
public class Article {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject;
    private String text;
    private String createdAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;
}
