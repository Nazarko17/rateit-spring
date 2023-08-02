package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.BookDAO;
import com.nazarko.rateitspring.dtos.BookDTO;
import com.nazarko.rateitspring.dtos.mappers.BookDTOMapper;
import com.nazarko.rateitspring.models.Book;
import com.nazarko.rateitspring.models.enums.BookGenre;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookDAO bookDAO;
    private final ModelMapper modelMapper;
    private final BookDTOMapper bookDTOMapper;

    public BookDTO findBook(int id) {
        return bookDTOMapper.apply(bookDAO.findById(id));
    }

    public Set<BookDTO> findBooks() {
        return bookDAO.findAll().stream().map(bookDTOMapper).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<BookGenre> findBookGenres(int id) {
        return bookDAO.findById(id).getGenres();
    }

    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookDAO.save(convertToEntity(bookDTO));
        return convertToDto(book);
    }

    public void deleteBook(int id) {
        bookDAO.deleteById(id);
    }

    public BookDTO convertToDto(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public Book convertToEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, Book.class);
    }
}
