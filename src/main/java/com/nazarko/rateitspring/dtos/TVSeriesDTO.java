package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TVSeriesDTO extends ContentDTO {

    private int id;
    private int releaseYear;
    private String trailerURL;
    private int numberOfEpisodes;
    private int averageRunTimeOfEpisodes;
}
