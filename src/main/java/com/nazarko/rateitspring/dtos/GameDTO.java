package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private int id;
    private String title;
    private String image;
    private float rating;
    private String developer;
    private String publisher;
    private String releaseDate;
    private String description;
    private int numberOfRatings;
}
