package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.UserDAO;
import com.nazarko.rateitspring.dtos.UserDTO;
import com.nazarko.rateitspring.dtos.mappers.UserDTOMapper;
import com.nazarko.rateitspring.models.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDAO userDAO;
    private final ModelMapper modelMapper;
    private final UserDTOMapper userDTOMapper;


    public UserDTO findUser(String username) {
        if(username == null || username.equals("   ") || username.equals("")){
            throw new IllegalArgumentException("Username is not valid! Username provided " + username);
        }
        return userDTOMapper.apply(userDAO.findUserByUsername(username));
    }

    // temporary method
    public UserDTO updateUser(UserDTO userDTO) {
        User user = userDAO.findById(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        System.out.println(user);
        userDAO.save(user);
        return convertToDto(user);
    }

    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    public UserDTO convertToDto(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public User convertToEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
