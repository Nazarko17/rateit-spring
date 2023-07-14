package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.MovieTVGenres;
import com.nazarko.rateitspring.models.enums.MovieTVRatingEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.Name;

import java.util.ArrayList;
import java.util.List;
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
    @Column(name = "movie_tv_genres")
    private Set<MovieTVGenres> movieTVGenres;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "movie_tv_genres")
    private Set<MovieTVRatingEnum> movieTVRatingsEnum;
}
