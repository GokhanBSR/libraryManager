package com.library.project.Repository;

import com.library.project.Entity.Borrower;
import com.library.project.common.entity.BaseEntity;
import com.library.project.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BorrowerRepository extends BaseRepository <Borrower, Long> {

//    /**
//     * @param title
//     * @return title
//     */
////    List<Borrower> findByTitleIgnoreCase(String title);
//
//    /**
//     * Drived query
//     * @param nameSurname
//     * @return borrower name and surname
//     */
//    //    @Query("SELECT c FROM User c JOIN c.roles r WHERE c.username =:username")
//    List<Borrower> findByNameSurnameContainingIgnoreCase(String nameSurname);
//
//    /**
//     * drived query
//     * @param email
//     * @return borrower email
//     */
    Borrower findByEmail (String email);

    Borrower findByNameSurname (String nameSurname);

//    /**
//     * drived query
//     * @param phoneNumber
//     * @return user phone number
//     */
//    List<Borrower> findByPhoneNumber (String phoneNumber);

}
