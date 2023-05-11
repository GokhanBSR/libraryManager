package com.library.project.Repository;

import com.library.project.Entity.Book;
import com.library.project.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository // spring stereotype
public interface BookRepository extends BaseRepository<Book, UUID> {

    /**
     * drived query
     *
     * @param isbn
     * @return find by book isbn info
     */
    Book findByIsbn(String isbn);

    /**
     * drived query
     *
     * @param title
     * @return find by book title
     */
    List<Book> findByTitle(String title);





}
