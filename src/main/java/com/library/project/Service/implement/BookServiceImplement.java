package com.library.project.Service.implement;

import com.library.project.Dto.BookDto;
import com.library.project.Entity.Book;
import com.library.project.Repository.BookRepository;
import com.library.project.Service.BookService;
import com.library.project.Service.mapper.BookMapper;
import com.library.project.common.service.implement.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplement extends BaseService<BookRepository, BookMapper, Book, BookDto> implements BookService {

//    @Autowired
//    BookRepository bookRepository;
    private final BookRepository bookRepository;

    /**
     * book acount
     * @param isbn
     */
    public void borrowBook(String isbn) {
        Book book = bookRepository.findByIsbn(isbn);
        if (book.getAvailableCopies() == 0) {

        } else
        {  book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookRepository.save(book);
        }
    }
//kitap sayısı artıyor

    public void returnBook(String isbn) {
        Book book = bookRepository.findByIsbn(isbn);
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        bookRepository.save(book);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void removeBook(Book book) {
        bookRepository.delete(book);
    }

    public Book getBook(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }
}
