package com.library.project.Entity;

import com.library.project.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor

public class Book extends BaseEntity {

    /**
     *Entity Author info
     */



    @Column (name = "author")
    private String author;

    /**
     * Entity Title info
     */
    @Column (name = "title")
    private String title;

    /**
     * Entity ISBN infos
     */
    @Column (name = "ISBN")
    private String isbn;

    private Integer availableCopies;

    /**
     * Entity Available copies info
     */
    @Column (name = "Enable")
    private boolean isEnable=true;
    @OneToMany(mappedBy = "book")
    private List<BookBorrower> bookBorrowerList;

//    /**
//     * Entity Category info
//     */
//    @Column (name = "Category")
//    private String category;


}
