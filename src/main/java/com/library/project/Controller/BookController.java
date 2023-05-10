package com.library.project.Controller;

import com.library.project.Dto.BookDto;
import com.library.project.Repository.BookRepository;
import com.library.project.Service.BookService;
import com.library.project.Service.BorrowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;
    private final BorrowerService borrowerService;

    public BookController(BookService bookService, BorrowerService borrowerService) {
        this.bookService = bookService;
        this.borrowerService = borrowerService;
    }

    @PostMapping("/add-book")
    ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.addBook(bookDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/remove-book")
    void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }

    @GetMapping("/get-book")
    ResponseEntity<BookDto> getBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.getBook(bookDto),HttpStatus.OK);
    }

    @PostMapping("/borrow-book")
    ResponseEntity<BookDto> borrowBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.borrowBook(bookDto),HttpStatus.OK);
    }

    @GetMapping("/return-book")
    ResponseEntity<BookDto> returnBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.returnBook(bookDto),HttpStatus.OK);
    }

}