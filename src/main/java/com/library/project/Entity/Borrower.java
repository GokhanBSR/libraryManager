package com.library.project.Entity;

import com.library.project.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * this pojo class is the one of 2 entity class
 */
@Table(name = "borrower")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Borrower extends BaseEntity {

    /**
     * Borrowers name information
     */
    @NotBlank
    @Column(name = "name")
    private String name;

    /**
     * Borrowers email information
     */
    @Size(min = 10, max = 50)
    @Column(name = "email")
    private String email;

    /**
     * Borrowers phone number information
     */
    @Size(min = 6, max = 20)
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * relation book and borrower
     */
    @OneToMany(mappedBy = "borrower")
    private List<Book> bookList;
}
