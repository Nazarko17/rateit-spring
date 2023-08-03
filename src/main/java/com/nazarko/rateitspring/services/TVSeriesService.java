package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.TVSeriesDAO;
import com.nazarko.rateitspring.dtos.TVSeriesDTO;
import com.nazarko.rateitspring.dtos.PersonRoleDTO;
import com.nazarko.rateitspring.dtos.ReviewDTO;
import com.nazarko.rateitspring.dtos.mappers.PersonRoleDTOMapper;
import com.nazarko.rateitspring.dtos.mappers.ReviewDTOMapper;
import com.nazarko.rateitspring.dtos.mappers.TVSeriesDTOMapper;
import com.nazarko.rateitspring.models.TVSeries;
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
public class TVSeriesService {

    private final TVSeriesDAO tvSeriesDAO;
    private final ModelMapper modelMapper;
    private final ReviewDTOMapper reviewDTOMapper;
    private final TVSeriesDTOMapper tvSeriesDTOMapper;
    private final PersonRoleDTOMapper personRoleDTOMapper;

    public TVSeriesDTO findTVSeries(int id) {
        return tvSeriesDTOMapper.apply(tvSeriesDAO.findById(id));
    }

    public Set<TVSeriesDTO> findTVSeries() {
        return tvSeriesDAO.findAll().stream().map(tvSeriesDTOMapper).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public MovieTVRatingEnum findTVSeriesRatingEnum(int id) {
        return tvSeriesDAO.findById(id).getRatingEnum();
    }

    public Set<String> findTVSeriesLanguages(int id) {
        return tvSeriesDAO.findById(id).getLanguages();
    }

    public Set<String> findTVSeriesProductionCompanies(int id) {
        return tvSeriesDAO.findById(id).getProductionCompanies();
    }

    public Set<MovieTVGenre> findTVSeriesGenres(int id) {
        return tvSeriesDAO.findById(id).getGenres();
    }

    public Set<Country> findTVSeriesCountriesOfOrigin(int id) {
        return tvSeriesDAO.findById(id).getCountriesOfOrigin();
    }

    public List<ReviewDTO> findTVSeriesReviews(int id) {
        return tvSeriesDAO.findById(id).getReviews().stream().map(reviewDTOMapper).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<PersonRoleDTO> findTVSeriesPersonRoles(int id) {
        return tvSeriesDAO.findById(id).getPersonRoles().stream().map(personRoleDTOMapper).collect(Collectors.toCollection(ArrayList::new));
    }

    public TVSeriesDTO saveTVSeries(TVSeriesDTO tvSeriesDTO) {
        TVSeries tvSeries = tvSeriesDAO.save(convertToEntity(tvSeriesDTO));
        return convertToDto(tvSeries);
    }

    public void deleteTVSeries(int id) {
        tvSeriesDAO.deleteById(id);
    }

    public TVSeriesDTO convertToDto(TVSeries tvSeries) {
        return modelMapper.map(tvSeries, TVSeriesDTO.class);
    }

    public TVSeries convertToEntity(TVSeriesDTO tvSeriesDTO) {
        return modelMapper.map(tvSeriesDTO, TVSeries.class);
    }
}
