package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EpisodeDTO {

    private int id;
    private String title;
    private int episodeNumber;
    private String description;
    private String releaseDate;

    private SeasonDTO seasonDTO;
}
