package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ReviewDAO extends JpaRepository<Review, Integer> {

    Set<Review> findByUserId(int id);
    Set<Review> findByBookId(int id);
    Set<Review> findByGameId(int id);
    Set<Review> findByMovieId(int id);
    Set<Review> findByTvSeriesId(int id);

    @Query("select r from Review r where r.id=:id")
    Review findById(int id);
}
