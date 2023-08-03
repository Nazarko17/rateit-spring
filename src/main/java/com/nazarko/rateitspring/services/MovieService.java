package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.MovieDAO;
import com.nazarko.rateitspring.dtos.MovieDTO;
import com.nazarko.rateitspring.dtos.PersonRoleDTO;
import com.nazarko.rateitspring.dtos.ReviewDTO;
import com.nazarko.rateitspring.dtos.mappers.MovieDTOMapper;
import com.nazarko.rateitspring.dtos.mappers.PersonRoleDTOMapper;
import com.nazarko.rateitspring.dtos.mappers.ReviewDTOMapper;
import com.nazarko.rateitspring.models.Movie;
import com.nazarko.rateitspring.models.enums.Country;
import com.nazarko.rateitspring.models.enums.MovieTVGenre;
import com.nazarko.rateitspring.models.enums.MovieTVRatingEnum;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieDAO movieDAO;
    private final ModelMapper modelMapper;
    private final MovieDTOMapper movieDTOMapper;
    private final ReviewDTOMapper reviewDTOMapper;
    private final PersonRoleDTOMapper personRoleDTOMapper;

    public MovieDTO findMovie(int id) {
        return movieDTOMapper.apply(movieDAO.findById(id));
    }

    public Set<MovieDTO> findMovies() {
        return movieDAO.findAll().stream().map(movieDTOMapper).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public MovieTVRatingEnum findMovieRatingEnum(int id) {
        return movieDAO.findById(id).getRatingEnum();
    }

    public Set<String> findMovieLanguages(int id) {
        return movieDAO.findById(id).getLanguages();
    }

    public Set<String> findMovieProductionCompanies(int id) {
        return movieDAO.findById(id).getProductionCompanies();
    }

    public Set<MovieTVGenre> findMovieGenres(int id) {
        return movieDAO.findById(id).getGenres();
    }

    public Set<Country> findMovieCountriesOfOrigin(int id) {
        return movieDAO.findById(id).getCountriesOfOrigin();
    }

    public List<ReviewDTO> findMovieReviews(int id) {
        return movieDAO.findById(id).getReviews().stream().map(reviewDTOMapper).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<PersonRoleDTO> findMoviePersonRoles(int id) {
        return movieDAO.findById(id).getPersonRoles().stream().map(personRoleDTOMapper).collect(Collectors.toCollection(ArrayList::new));
    }

    public MovieDTO saveMovie(MovieDTO movieDTO) {
        Movie movie = movieDAO.save(convertToEntity(movieDTO));
        return convertToDto(movie);
    }

    public void deleteMovie(int id) {
        movieDAO.deleteById(id);
    }

    public MovieDTO convertToDto(Movie movie) {
        return modelMapper.map(movie, MovieDTO.class);
    }

    public Movie convertToEntity(MovieDTO movieDTO) {
        return modelMapper.map(movieDTO, Movie.class);
    }
}
