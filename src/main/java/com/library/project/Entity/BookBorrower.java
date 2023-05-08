package com.library.project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class BookBorrower {

    @Id
    private Long id;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Borrower borrower;

}
