package com.library.project.Repository;

import com.library.project.Entity.Borrower;
import com.library.project.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository // spring stereotype
public interface BorrowerRepository extends BaseRepository<Borrower, UUID> {

    /**
     * drived query
     * @param email
     * @return borrower email
     */
    Borrower findByEmail(String email);

    /**
     * drived query
     * @param phoneNumber
     * @return user phone number
     */
    List<Borrower> findByPhoneNumber (String phoneNumber);

}
