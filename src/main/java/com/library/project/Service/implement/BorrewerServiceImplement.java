package com.library.project.Service.implement;

import com.library.project.Entity.Borrower;
import com.library.project.Repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrewerServiceImplement {
    @Autowired
    BorrowerRepository borrowerRepository;



    public Borrower addBorrower(Borrower borrower) {


        return borrowerRepository.save(borrower);
    }

    public void removeBorrower(Borrower borrower) {
        borrowerRepository.delete(borrower);
    }

    public Borrower getBorrowerByEmail(String email) {
        return borrowerRepository.findByEmail(email);
    }

}
