package com.nazarko.rateitspring.dtos;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
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
