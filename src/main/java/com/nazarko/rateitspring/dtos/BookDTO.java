package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private int id;
    private String title;
    private float rating;
    private String image;
    private int releaseYear;
    private String description;
    private int numberOfRatings;
}
