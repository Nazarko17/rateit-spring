package com.nazarko.rateitspring.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"review", "user"})
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject;
    private String text;
    private String createdAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Review review;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;
}
