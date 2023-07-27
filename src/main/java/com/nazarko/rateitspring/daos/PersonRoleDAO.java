package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.PersonRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRoleDAO extends JpaRepository<PersonRole, Integer> {

    List<PersonRole> findByPersonId(int id);
    List<PersonRole> findByBookId(int id);
    List<PersonRole> findByMovieId(int id);
    List<PersonRole> findByTvSeriesId(int id);

    @Query("select p from PersonRole p where p.id=:id")
    PersonRole findById(int id);
}
