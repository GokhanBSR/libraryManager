package com.library.project.Entity;

import com.library.project.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Borrower extends BaseEntity {

    /**
     * Borrowers name and surname
     */
    @NotBlank
    @Column(name = "name_surname")
    private String nameSurname;

    /**
     * Borrowers email info
     */
    @Size(min = 10, max = 50)
    @Column(name = "email")
    private String email;

    /**
     * Borrowers phone number info
     */
    @Size(min = 6, max = 20)
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "borrower")
    private List<BookBorrower> bookBorrowerList;
}
