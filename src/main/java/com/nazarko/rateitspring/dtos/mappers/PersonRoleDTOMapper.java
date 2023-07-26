package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.PersonRoleDTO;
import com.nazarko.rateitspring.models.PersonRole;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PersonRoleDTOMapper implements Function<PersonRole, PersonRoleDTO> {

    BookDTOMapper bookDTOMapper = new BookDTOMapper();
    MovieDTOMapper movieDTOMapper = new MovieDTOMapper();
    TVSeriesDTOMapper tvSeriesDTOMapper = new TVSeriesDTOMapper();
    PersonDTOMapper personDTOMapper = new PersonDTOMapper();

    @Override
    public PersonRoleDTO apply(PersonRole personRole) {
        return new PersonRoleDTO(
                personRole.getId(),
                personRole.getTitle(),
                personRole.getPersonRoleEnum(),
                movieDTOMapper.apply(personRole.getMovie()),
                tvSeriesDTOMapper.apply(personRole.getTvSeries()),
                bookDTOMapper.apply(personRole.getBook()),
                personDTOMapper.apply(personRole.getPerson())
        );
    }
}
