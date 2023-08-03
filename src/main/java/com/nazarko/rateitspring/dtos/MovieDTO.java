package com.nazarko.rateitspring.dtos;

import com.nazarko.rateitspring.models.enums.MovieTVRatingEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

    private int id;
    private String title;
    private float rating;
    private String image;
    private int releaseDate;
    private String trailerURL;
    private String description;
    private int numberOfRatings;
    private int runTime;
    private float budget;
    private float boxOffice;

    @Enumerated(EnumType.STRING)
    private MovieTVRatingEnum ratingEnum;
}
