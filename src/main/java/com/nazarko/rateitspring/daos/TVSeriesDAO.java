package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.TVSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TVSeriesDAO extends JpaRepository<TVSeries, Integer> {

    @Query("select t from TVSeries t where t.id=:id")
    TVSeries findById(int id);
}
