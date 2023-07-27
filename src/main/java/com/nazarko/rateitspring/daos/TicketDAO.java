package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Comment;
import com.nazarko.rateitspring.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketDAO extends JpaRepository<Ticket, Integer> {

    List<Ticket> findByUserId(int id);

    @Query("select t from Ticket t where t.id=:id")
    Ticket findById(int id);
}
