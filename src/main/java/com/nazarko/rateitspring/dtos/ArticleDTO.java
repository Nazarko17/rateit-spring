package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDTO {

    private int id;
    private String text;
    private String subject;
    private String createdAt;

    private UserDTO userDTO;
}
