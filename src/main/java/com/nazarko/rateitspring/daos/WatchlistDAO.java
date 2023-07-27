package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WatchlistDAO extends JpaRepository<Watchlist, Integer> {

    Watchlist findByUserId(int id);

    @Query("select w from Watchlist w where w.id=:id")
    Watchlist findById(int id);
}
