package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO extends ContentDTO {

    private int id;
    private int releaseYear;
    private int runTime;
    private float budget;
    private float boxOffice;
    private String trailerURL;
}
