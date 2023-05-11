package com.library.project.Service;

import com.library.project.Dto.BookDto;

public interface BookService {

    /**
     * Adds a new book to the list of books
     * @param bookDto add bookdto
     * @return bookDto
     */
    BookDto addBook(BookDto bookDto);

    /**
     * Remove book from list of book
     *
     * @param bookDto
     * @return
     */
    void removeBook(BookDto bookDto);

    BookDto getBook(BookDto bookDto);

    BookDto borrowBook(BookDto bookDto);

    BookDto returnBook(BookDto bookDto);

}
