package com.library.project.Controller;

import com.library.project.Dto.BorrowerDto;
import com.library.project.Service.BookService;
import com.library.project.Service.BorrowerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BorrowerController {
    private final BorrowerService borrowerService;
    private final BookService bookService;

    public BorrowerController(BorrowerService borrowerService, BookService bookService) {
        this.borrowerService = borrowerService;
        this.bookService = bookService;
    }

    @RequestMapping(value = "/add-borrower", method = {RequestMethod.GET, RequestMethod.POST})
    public String showBorrowerPage (@ModelAttribute (value = "borrower")BorrowerDto borrowerDto){
        return "addUser";
    }

}
