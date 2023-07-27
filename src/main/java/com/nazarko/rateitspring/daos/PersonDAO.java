package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonDAO extends JpaRepository<Person, Integer> {

    @Query("select p from Person p where p.id=:id")
    Person findById(int id);
}
