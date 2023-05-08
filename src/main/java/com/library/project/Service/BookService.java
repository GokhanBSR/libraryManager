package com.library.project.Service;

import com.library.project.Dto.BookDto;
import com.library.project.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
public interface BookService {

    BookDto addBook (BookDto bookDto);

    BookDto getBook (BookDto bookDto);

    BookDto updateBook (BookDto bookDto);

    void delete (BookDto bookDto);

    List<BookDto> findAll();
    List<BookDto> findByAuthor();
    List<BookDto> findByTitle();

}