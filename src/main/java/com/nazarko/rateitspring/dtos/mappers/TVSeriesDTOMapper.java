package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.TVSeriesDTO;
import com.nazarko.rateitspring.models.TVSeries;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TVSeriesDTOMapper implements Function<TVSeries, TVSeriesDTO> {

    @Override
    public TVSeriesDTO apply(TVSeries tvSeries) {
        return new TVSeriesDTO(
                tvSeries.getId(),
                tvSeries.getTitle(),
                tvSeries.getRating(),
                tvSeries.getImage(),
                tvSeries.getReleaseDate(),
                tvSeries.getTrailerURL(),
                tvSeries.getDescription(),
                tvSeries.getNumberOfRatings(),
                tvSeries.getNumberOfEpisodes(),
                tvSeries.getAverageRunTimeOfEpisodes()
        );
    }
}
