package com.nazarko.rateitspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {

    private int id;
    private int rating;
    private int likes;
    private int dislikes;
    private String createdAt;
    private String text;
    private String subject;
    private boolean isContainsSpoiler;

    private UserDTO userDTO;
    private GameDTO gameDTO;
    private BookDTO bookDTO;
    private MovieDTO movieDTO;
    private TVSeriesDTO tvSeriesDTO;
}
