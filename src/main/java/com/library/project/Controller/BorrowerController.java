package com.library.project.Controller;

import com.library.project.Dto.BorrowerDto;
import com.library.project.Service.BorrowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BorrowerController {
    private final BorrowerService borrowerService; //constructor injection


    public BorrowerController(BorrowerService borrowerService) {
        this.borrowerService = borrowerService;
    }

    /**
     * end point. takes a response
     *
     * @param borrowerDto
     * @return borrower
     */
    @PostMapping("/add-borrower")
    ResponseEntity<BorrowerDto> addBrower(@RequestBody BorrowerDto borrowerDto) {
        return new ResponseEntity<>(borrowerService.addBorrower(borrowerDto), HttpStatus.CREATED);
    }

    /**
     * endPoint. delete request.
     *
     * @param borrowerDto
     */
    @DeleteMapping("/remove-borrower")
    void removeBook(@RequestBody BorrowerDto borrowerDto) {
        borrowerService.removeBorrower(borrowerDto);
    }

    /**
     * endPoint takes a response
     *
     * @param borrowerDto
     * @return borrower
     */
    @GetMapping("/get-borrower")
    ResponseEntity<BorrowerDto> getBorrower(@RequestBody BorrowerDto borrowerDto) {
        return new ResponseEntity<>(borrowerService.getBorrower(borrowerDto), HttpStatus.OK);
    }
}
