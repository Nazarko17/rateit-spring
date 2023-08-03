package com.nazarko.rateitspring.services;

import com.nazarko.rateitspring.daos.BookDAO;
import com.nazarko.rateitspring.dtos.BookDTO;
import com.nazarko.rateitspring.dtos.PersonRoleDTO;
import com.nazarko.rateitspring.dtos.ReviewDTO;
import com.nazarko.rateitspring.dtos.mappers.BookDTOMapper;
import com.nazarko.rateitspring.dtos.mappers.PersonRoleDTOMapper;
import com.nazarko.rateitspring.dtos.mappers.ReviewDTOMapper;
import com.nazarko.rateitspring.models.Book;
import com.nazarko.rateitspring.models.enums.BookGenre;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookDAO bookDAO;
    private final ModelMapper modelMapper;
    private final BookDTOMapper bookDTOMapper;
    private final ReviewDTOMapper reviewDTOMapper;
    private final PersonRoleDTOMapper personRoleDTOMapper;

    public BookDTO findBook(int id) {
        return bookDTOMapper.apply(bookDAO.findById(id));
    }

    public Set<BookDTO> findBooks() {
        return bookDAO.findAll().stream().map(bookDTOMapper).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<BookGenre> findBookGenres(int id) {
        return bookDAO.findById(id).getGenres();
    }

    public List<ReviewDTO> findBookReviews(int id) {
        return bookDAO.findById(id).getReviews().stream().map(reviewDTOMapper).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<PersonRoleDTO> findBookPersonRoles(int id) {
        return bookDAO.findById(id).getPersonRoles().stream().map(personRoleDTOMapper).collect(Collectors.toCollection(ArrayList::new));
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
