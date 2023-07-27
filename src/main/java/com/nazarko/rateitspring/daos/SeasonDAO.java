package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Season;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SeasonDAO extends JpaRepository<Season, Integer> {

    Set<Season> findByTvSeriesId(int id);
}
