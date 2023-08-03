package com.nazarko.rateitspring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject;
    private String text;

    @JsonProperty("status")
    private boolean status;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;
}
