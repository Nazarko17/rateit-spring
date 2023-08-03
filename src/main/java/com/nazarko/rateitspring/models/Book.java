package com.nazarko.rateitspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nazarko.rateitspring.models.enums.BookGenre;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = {"personRoles", "reviews"})
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private float rating;
    private String image;
    private int releaseYear;
    private int numberOfPages;
    private String description;
    private int numberOfRatings;

    @JsonIgnore
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<BookGenre> genres = new HashSet<>();

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private List<Review> reviews = new ArrayList<>();

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private List<PersonRole> personRoles = new ArrayList<>();
}
