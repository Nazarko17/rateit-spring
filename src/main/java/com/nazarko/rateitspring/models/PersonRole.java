package com.nazarko.rateitspring.models;

import com.nazarko.rateitspring.models.enums.PersonRoleEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"movie", "person"})
public class PersonRole {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @Enumerated(EnumType.STRING)
    private PersonRoleEnum personRoleEnum = PersonRoleEnum.ACTOR;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Movie movie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private TVSeries tvSeries;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Book book;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Person person;
}
