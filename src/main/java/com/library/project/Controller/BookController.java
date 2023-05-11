package com.library.project.Controller;

import com.library.project.Dto.BookDto;
import com.library.project.Service.BookService;
import com.library.project.Service.BorrowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {
    private final BookService bookService;  // constructor injection
    private final BorrowerService borrowerService; // constructor injection

    public BookController(BookService bookService, BorrowerService borrowerService) {
        this.bookService = bookService;
        this.borrowerService = borrowerService;
    }

    /**
     * endPoints
     *
     * @param bookDto
     * @return
     */
    @PostMapping("/add-book")
    ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.addBook(bookDto), HttpStatus.CREATED);
    }

    /**
     * endPoints
     *
     * @param bookDto
     */
    @DeleteMapping("/remove-book")
    void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }

    /**
     * endPoints
     *
     * @param bookDto
     * @return
     */
    @GetMapping("/get-book")
    ResponseEntity<BookDto> getBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.getBook(bookDto), HttpStatus.OK);
    }

    /**
     * endPoints
     *
     * @param bookDto
     * @return
     */
    @PostMapping("/borrow-book")
    ResponseEntity<BookDto> borrowBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.borrowBook(bookDto), HttpStatus.OK);
    }

    /**
     * endPoints
     *
     * @param bookDto
     * @return
     */
    @GetMapping("/return-book")
    ResponseEntity<BookDto> returnBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.returnBook(bookDto), HttpStatus.OK);
    }
}