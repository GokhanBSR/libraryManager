package com.library.project.Service;

import com.library.project.Dto.BorrowerDto;

public interface BorrowerService {

    /**
     * Adds a new borrower to the list of borrowers
     * @return
     */
    BorrowerDto addBorrower(BorrowerDto borrowerDto);

    /**
     * Removes a borrower from the list of borrowers
     *
     * @param borrowerDto
     */
    void removeBorrower(BorrowerDto borrowerDto);

    /**
     * Returns a borrower based on their email
     * @param borrowerDto
     * @return
     */
    BorrowerDto getBorrower(BorrowerDto borrowerDto);
}
