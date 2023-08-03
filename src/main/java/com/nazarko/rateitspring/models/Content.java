package com.nazarko.rateitspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nazarko.rateitspring.models.enums.Country;
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
    private int releaseDate;
    private String trailerURL;
    private String description;
    private int numberOfRatings;

    @Enumerated(EnumType.STRING)
    private MovieTVRatingEnum ratingEnum;

    @JsonIgnore
    @ElementCollection
    private Set<String> languages = new HashSet<>();

    @JsonIgnore
    @ElementCollection
    private Set<String> productionCompanies = new HashSet<>();

    @JsonIgnore
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<MovieTVGenre> genres = new HashSet<>();

    @JsonIgnore
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<Country> countriesOfOrigin = new HashSet<>();
}
