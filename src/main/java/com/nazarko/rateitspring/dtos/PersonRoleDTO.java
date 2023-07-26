package com.nazarko.rateitspring.dtos;

import com.nazarko.rateitspring.models.Book;
import com.nazarko.rateitspring.models.Movie;
import com.nazarko.rateitspring.models.Person;
import com.nazarko.rateitspring.models.TVSeries;
import com.nazarko.rateitspring.models.enums.PersonRoleEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonRoleDTO {

    private int id;
    private String title;

    @Enumerated(EnumType.STRING)
    private PersonRoleEnum personRoleEnum;

    private MovieDTO movieDTO;
    private TVSeriesDTO tvSeriesDTO;
    private BookDTO bookDTO;
    private PersonDTO personDTO;
}
