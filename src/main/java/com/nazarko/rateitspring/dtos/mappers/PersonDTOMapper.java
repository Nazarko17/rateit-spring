package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.PersonDTO;
import com.nazarko.rateitspring.models.Person;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PersonDTOMapper implements Function<Person, PersonDTO> {

    @Override
    public PersonDTO apply(Person person) {
        return new PersonDTO(
                person.getId(),
                person.getName(),
                person.getSurname(),
                person.getBio(),
                person.getAvatar()
        );
    }
}
