package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.SeasonDTO;
import com.nazarko.rateitspring.models.Season;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SeasonDTOMapper implements Function<Season, SeasonDTO> {

    TVSeriesDTOMapper tvSeriesDTOMapper = new TVSeriesDTOMapper();

    @Override
    public SeasonDTO apply(Season season) {
        return new SeasonDTO(
                season.getId(),
                season.getSeasonNumber(),
                tvSeriesDTOMapper.apply(season.getTvSeries())
        );
    }
}
