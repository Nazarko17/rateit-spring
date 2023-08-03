package com.nazarko.rateitspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nazarko.rateitspring.models.enums.GameGenre;
import com.nazarko.rateitspring.models.enums.GamePlatform;
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
    private int numberOfRatings;

    @JsonIgnore
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<GameGenre> genres = new HashSet<>();

    @JsonIgnore
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<GamePlatform> platforms = new HashSet<>();

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "game")
    private List<Review> reviews = new ArrayList<>();
}
