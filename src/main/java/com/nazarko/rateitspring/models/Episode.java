package com.nazarko.rateitspring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Episode {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int episodeNumber;
    private String description;
    private String releaseDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Season season;
}
