package com.library.project.Entity;

import com.library.project.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * this pojo class is the one of 2 entity class
 */
@Entity
@Table(name = "book")
@Getter
@Setter
@RequiredArgsConstructor

public class Book extends BaseEntity {

    /**
     * Entity Author info
     */
    @Column(name = "author")
    private String author;

    /**
     * Entity Title info
     */
    @Column(name = "title")
    private String title;

    /**
     * Entity ISBN infos
     */
    @Column(name = "ISBN")
    private String isbn;

    /**
     * Books available copies info
     */
    private int availableCopies;

    /**
     * relation  borrower and book
     * cascade and fetch strategies
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "book")
    private Borrower borrower;

}
