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
    private final BookRepository bookRepository;

    public BookController(BookService bookService, BorrowerService borrowerService,
                          BookRepository bookRepository) {
        this.bookService = bookService;
        this.borrowerService = borrowerService;
        this.bookRepository = bookRepository;
    }
    @GetMapping ("/add-book")
    ResponseEntity<BookDto>addBook(@RequestBody BookDto bookDto){
        return new ResponseEntity<>(bookService.addBook(bookDto), HttpStatus.CREATED);
    }

    @GetMapping ("/get-all-books")
    ResponseEntity<List<BookDto>> allBooks(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }
    @GetMapping ("/search-books-by-author")
    ResponseEntity<List<BookDto>> getByAuthor (@PathVariable String author){
        return new ResponseEntity<>(bookService.findByAuthor(author), HttpStatus.OK);
    }
    @GetMapping ("/search-books-by-title")
    ResponseEntity<List<BookDto>> getByTitle (@RequestParam ("title")String title){
        return new ResponseEntity<>(bookService.findByTitle(title), HttpStatus.OK);
    }
}