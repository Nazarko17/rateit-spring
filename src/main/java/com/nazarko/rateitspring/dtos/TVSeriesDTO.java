package com.nazarko.rateitspring.dtos;

import com.nazarko.rateitspring.models.enums.MovieTVRatingEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TVSeriesDTO {

    private int id;
    private String title;
    private float rating;
    private String image;
    private int releaseDate;
    private String trailerURL;
    private String description;
    private int numberOfRatings;
    private int numberOfEpisodes;
    private int averageRunTimeOfEpisodes;

    @Enumerated(EnumType.STRING)
    private MovieTVRatingEnum ratingEnum;
}
