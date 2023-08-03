package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.MovieDTO;
import com.nazarko.rateitspring.models.Movie;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class MovieDTOMapper implements Function<Movie, MovieDTO> {

    @Override
    public MovieDTO apply(Movie movie) {
        return new MovieDTO(
                movie.getId(),
                movie.getTitle(),
                movie.getRating(),
                movie.getImage(),
                movie.getReleaseDate(),
                movie.getTrailerURL(),
                movie.getDescription(),
                movie.getNumberOfRatings(),
                movie.getRunTime(),
                movie.getBudget(),
                movie.getBoxOffice(),
                movie.getRatingEnum()
        );
    }
}
