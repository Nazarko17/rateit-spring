package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.MovieTVGenre;
import com.nazarko.rateitspring.models.enums.MovieTVRatingEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Content {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private float rating;
    private String image;
    private String description;

    @ElementCollection
    private Set<String> languages = new HashSet<>();

    @ElementCollection
    private Set<String> countriesOfOrigin = new HashSet<>();

    @ElementCollection
    private Set<String> productionCompanies = new HashSet<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<MovieTVGenre> genres;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<MovieTVRatingEnum> ratingsEnum;
}
