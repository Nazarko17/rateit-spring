package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.MovieTVGenres;
import com.nazarko.rateitspring.models.enums.MovieTVRatingEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String language;
    private String description;
    private String countryOfOrigin;
    private String productionCompany;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<MovieTVGenres> genres;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<MovieTVRatingEnum> ratingsEnum;
}
