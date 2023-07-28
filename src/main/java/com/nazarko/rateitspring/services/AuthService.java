package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.UserDAO;
import com.nazarko.rateitspring.dtos.UserDTO;
import com.nazarko.rateitspring.dtos.jwt.JwtRequest;
import com.nazarko.rateitspring.dtos.jwt.JwtResponse;
import com.nazarko.rateitspring.dtos.jwt.RegisterRequest;
import com.nazarko.rateitspring.dtos.mappers.UserDTOMapper;
import com.nazarko.rateitspring.models.User;
import com.nazarko.rateitspring.models.enums.UserRoleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserDAO userDAO;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsServiceImpl userDetailsService;
    private final UserDTOMapper userDTOMapper;

    public JwtResponse register(RegisterRequest request) {
        var user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .userRoleEnum(UserRoleEnum.USER)
                .isAccountNonExpired(true)
                .isAccountNonLocked(true)
                .isCredentialsNonExpired(true)
                .isEnabled(true)
                .build();
        userDAO.save(user);
        var jwtToken = jwtService.generateToken(user);
        return JwtResponse.builder()
                .token(jwtToken)
                .build();
    }

    public JwtResponse authenticate(JwtRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        var user = userDAO.findByUsername(request.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return JwtResponse.builder()
                .token(jwtToken)
                .build();
    }

    public UserDTO findCurrentUser(Principal principal) {
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(principal.getName());
        return userDTOMapper.apply((User) userDetails);
    }
}
