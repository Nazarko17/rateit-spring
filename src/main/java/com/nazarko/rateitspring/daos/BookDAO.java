package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookDAO extends JpaRepository<Book, Integer> {

    @Query("select b from Book b where b.id=:id")
    Book findById(int id);
}