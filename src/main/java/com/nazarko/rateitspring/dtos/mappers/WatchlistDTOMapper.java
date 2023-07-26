package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.WatchlistDTO;
import com.nazarko.rateitspring.models.Watchlist;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class WatchlistDTOMapper implements Function<Watchlist, WatchlistDTO> {

    UserDTOMapper userDTOMapper = new UserDTOMapper();

    @Override
    public WatchlistDTO apply(Watchlist watchlist) {
        return new WatchlistDTO(
                watchlist.getId(),
                watchlist.getNumberOfGames(),
                watchlist.getNumberOfBooks(),
                watchlist.getNumberOfMovies(),
                watchlist.getNumberOfTVSeries(),
                watchlist.getOverallNumberOfContent(),
                userDTOMapper.apply(watchlist.getUser())
        );
    }
}
