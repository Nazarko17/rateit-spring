package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GameDAO extends JpaRepository<Game, Integer> {

    @Query("select g from Game g where g.id=:id")
    Game findById(int id);
}
