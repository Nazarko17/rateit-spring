package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private int id;
    private String name;
    private String surname;
    private String bio;
    private String avatar;
}
