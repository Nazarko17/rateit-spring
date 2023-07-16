package com.nazarko.rateitspring.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"user", "movie", "comments"})
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rating;
    private int likes;
    private int dislikes;
    private String createdAt;
    private String text = null;
    private String subject = null;
    private boolean isContainsSpoiler;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Movie movie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private TVSeries tvSeries;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Game game;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Book book;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "review")
    private List<Comment> comments = new ArrayList<>();
}
