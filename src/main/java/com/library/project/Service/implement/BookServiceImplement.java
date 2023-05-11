package com.library.project.Service.implement;

import com.library.project.Dto.BookDto;
import com.library.project.Entity.Book;
import com.library.project.Repository.BookRepository;
import com.library.project.Service.BookService;
import com.library.project.Service.mapper.BookMapper;
import com.library.project.common.service.implement.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // spring stereotype
public class BookServiceImplement extends BaseService<BookRepository, BookMapper, Book, BookDto> implements BookService {

    private final BookRepository bookRepository; //constructor injection
    private final BookMapper bookMapper; //constructor injection

    /**
     * Constructor Injection
     *
     * @param mapper         mapper
     * @param repository     repository
     * @param bookRepository
     * @param bookMapper
     */
    @Autowired
    public BookServiceImplement(BookMapper mapper, BookRepository repository, BookRepository bookRepository, BookMapper bookMapper) {
        super(mapper, repository);
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    /**
     * override metots from bookService
     *
     * @param bookDto
     * @return super's save metot as bookDto
     */
    @Override
    public BookDto addBook(BookDto bookDto) {
        return super.save(bookDto);
    }

    @Override
    public void removeBook(BookDto bookDto) {
        super.deleteById(bookDto.getUuid());
    }

    @Override
    public BookDto getBook(BookDto bookDto) {
        return bookMapper.entityToDto(bookRepository.findByIsbn(bookDto.getIsbn()));
    }

    @Override
    public BookDto borrowBook(BookDto bookDto) {
        return super.save(bookDto);
    }

    @Override
    public BookDto returnBook(BookDto bookDto) {
        return null;
    }


}
