package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.BookGenre;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
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
    private float rating;
    private String image;
    private int releaseYear;
    private String description;
    private int numberOfRatings;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<BookGenre> genres;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private List<PersonRole> personRoles = new ArrayList<>();
}
