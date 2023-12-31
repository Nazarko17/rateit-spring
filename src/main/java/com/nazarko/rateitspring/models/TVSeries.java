package com.nazarko.rateitspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = {"reviews", "personRoles", "seasons"})
public class TVSeries extends Content {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberOfEpisodes;
    private int averageRunTimeOfEpisodes;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tvSeries")
    private List<Review> reviews = new ArrayList<>();

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tvSeries")
    private List<PersonRole> personRoles = new ArrayList<>();

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tvSeries")
    private Set<Season> seasons = new HashSet<>();
}
