package com.nazarko.rateitspring.daos;

import com.nazarko.rateitspring.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface CommentDAO extends JpaRepository<Comment, Integer> {

    Set<Comment> findByUserId(int id);
    Set<Comment> findByReviewId(int id);

    @Query("select c from Comment c where c.id=:id")
    Comment findById(int id);
}
