package com.nazarko.rateitspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = "episodes")
public class Season {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int seasonNumber;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private TVSeries tvSeries;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "season")
    private Set<Episode> episodes = new HashSet<>();
}
