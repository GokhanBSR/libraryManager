package com.library.project.Repository;

import com.library.project.Entity.Book;
import com.library.project.common.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BookRepository extends BaseRepository <Book, Long> {
//
//    /**
//     * drived query
//     * @param uuids
//     * @return book uuid
//     */
////    List<Book> findAllByUuid(UUID uuids);
//
//    /**
//     * drived query
//     * @param title
//     * @return find by book title
//     */
//    List<Book> findByTitle(String title);
//
//    /**
//     * drived query
//     * @param author
//     * @return book author
//     */
//    List<Book> findByAuthor(String author);
    Book findByIsbn(String isbn);




}
