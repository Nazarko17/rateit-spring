package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieDAO extends JpaRepository<Movie, Integer> {

    @Query("select m from Movie m where m.id=:id")
    Movie findById(int id);
}
