package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.ReviewDTO;
import com.nazarko.rateitspring.models.Review;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ReviewDTOMapper implements Function<Review, ReviewDTO> {

    UserDTOMapper userDTOMapper = new UserDTOMapper();
    GameDTOMapper gameDTOMapper = new GameDTOMapper();
    BookDTOMapper bookDTOMapper = new BookDTOMapper();
    MovieDTOMapper movieDTOMapper = new MovieDTOMapper();
    TVSeriesDTOMapper tvSeriesDTOMapper = new TVSeriesDTOMapper();

    @Override
    public ReviewDTO apply(Review review) {
        return new ReviewDTO(
                review.getId(),
                review.getRating(),
                review.getLikes(),
                review.getDislikes(),
                review.getCreatedAt(),
                review.getText(),
                review.getSubject(),
                review.isContainsSpoiler(),
                userDTOMapper.apply(review.getUser()),
                gameDTOMapper.apply(review.getGame()),
                bookDTOMapper.apply(review.getBook()),
                movieDTOMapper.apply(review.getMovie()),
                tvSeriesDTOMapper.apply(review.getTvSeries())

        );
    }
}
