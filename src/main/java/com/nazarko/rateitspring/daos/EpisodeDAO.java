package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface EpisodeDAO extends JpaRepository<Episode, Integer> {

    Set<EpisodeDAO> findBySeasonId(int id);
}
