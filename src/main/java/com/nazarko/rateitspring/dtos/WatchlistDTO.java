package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WatchlistDTO {

    private int id;
    private int numberOfGames;
    private int numberOfBooks;
    private int numberOfMovies;
    private int numberOfTVSeries;
    private int overallNumberOfContent;

    private UserDTO userDTO;
}
