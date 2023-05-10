package com.library.project.Service;

import com.library.project.Dto.BookDto;
import jakarta.persistence.Id;

import java.util.List;

public interface BookService {

    /**
     * Adds a new book to the list of books
     * @param bookDto add bookdto
     * @return bookDto
     */
    BookDto addBook(BookDto bookDto);

    /**
     * Returns a book based on its ISBN
     * @param bookDto
     * @return
     */
    void removeBook(BookDto bookDto);

    BookDto getBook(BookDto bookDto);

    BookDto borrowBook(BookDto bookDto);

    BookDto returnBook(BookDto bookDto);

}
