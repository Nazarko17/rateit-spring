package com.nazarko.rateitspring.dtos.mappers;

import com.nazarko.rateitspring.dtos.BookDTO;
import com.nazarko.rateitspring.models.Book;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class BookDTOMapper implements Function<Book, BookDTO> {

    @Override
    public BookDTO apply(Book book) {
        return new BookDTO(
                book.getId(),
                book.getTitle(),
                book.getRating(),
                book.getImage(),
                book.getReleaseYear(),
                book.getDescription(),
                book.getNumberOfRatings()
        );
    }
}
