package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.GameDTO;
import com.nazarko.rateitspring.models.Game;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class GameDTOMapper implements Function<Game, GameDTO> {

    @Override
    public GameDTO apply(Game game) {
        return new GameDTO(
                game.getId(),
                game.getTitle(),
                game.getImage(),
                game.getRating(),
                game.getDeveloper(),
                game.getPublisher(),
                game.getReleaseDate(),
                game.getDescription(),
                game.getNumberOfRatings()
        );
    }
}
