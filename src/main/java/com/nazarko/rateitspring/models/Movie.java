package com.nazarko.rateitspring.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = {"personRoles", "reviews"})
public class Movie extends Content {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int releaseYear;
    private int runTime;
    private float budget;
    private float boxOffice;
    private String trailerURL;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "movie")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "movie")
    private List<PersonRole> personRoles = new ArrayList<>();
}
