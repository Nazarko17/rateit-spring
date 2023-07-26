package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.UserDTO;
import com.nazarko.rateitspring.models.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserDTOMapper implements Function<User, UserDTO> {

    @Override
    public UserDTO apply(User user) {
        return new UserDTO(
                user.getId(),
                user.getEmail(),
                user.getUsername(),
                user.getCreatedAt()
        );
    }
}
