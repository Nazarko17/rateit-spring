package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.CommentDTO;
import com.nazarko.rateitspring.models.Comment;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CommentDTOMapper  implements Function<Comment, CommentDTO> {

    UserDTOMapper userDTOMapper = new UserDTOMapper();
    ReviewDTOMapper reviewDTOMapper = new ReviewDTOMapper();

    @Override
    public CommentDTO apply(Comment comment) {
        return new CommentDTO(
                comment.getId(),
                comment.getText(),
                comment.getSubject(),
                comment.getCreatedAt(),
                userDTOMapper.apply(comment.getUser()),
                reviewDTOMapper.apply(comment.getReview())
        );
    }
}
