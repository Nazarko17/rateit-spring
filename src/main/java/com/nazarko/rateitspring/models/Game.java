package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.GameGenre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String image;
    private float rating;
    private String developer;
    private String publisher;
    private String releaseDate;
    private String description;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<GameGenre> genres;

    @ElementCollection
    private Set<String> platforms = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "game")
    private List<Review> reviews = new ArrayList<>();
}
