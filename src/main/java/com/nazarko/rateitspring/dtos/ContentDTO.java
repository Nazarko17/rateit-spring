package com.nazarko.rateitspring.dtos;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class ContentDTO {

    private int id;
    private String title;
    private float rating;
    private String image;
    private String description;
    private int numberOfRatings;
}
