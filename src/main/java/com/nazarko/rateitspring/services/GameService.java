package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.GameDAO;
import com.nazarko.rateitspring.dtos.GameDTO;
import com.nazarko.rateitspring.dtos.mappers.GameDTOMapper;
import com.nazarko.rateitspring.models.Game;
import com.nazarko.rateitspring.models.enums.GameGenre;
import com.nazarko.rateitspring.models.enums.GamePlatform;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameDAO gameDAO;
    private final ModelMapper modelMapper;
    private final GameDTOMapper gameDTOMapper;

    public GameDTO findGame(int id) {
        return gameDTOMapper.apply(gameDAO.findById(id));
    }

    public Set<GameDTO> findGames() {
        return gameDAO.findAll().stream().map(gameDTOMapper).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<GameGenre> findGameGenres(int id) {
        return gameDAO.findById(id).getGenres();
    }

    public Set<GamePlatform> findGamePlatforms(int id) {
        return gameDAO.findById(id).getPlatforms();
    }

    public GameDTO saveGame(GameDTO gameDTO) {
        Game game = gameDAO.save(convertToEntity(gameDTO));
        return convertToDto(game);
    }

    public void deleteGame(int id) {
        gameDAO.deleteById(id);
    }

    public GameDTO convertToDto(Game game) {
        return modelMapper.map(game, GameDTO.class);
    }

    public Game convertToEntity(GameDTO gameDTO) {
        return modelMapper.map(gameDTO, Game.class);
    }
}
