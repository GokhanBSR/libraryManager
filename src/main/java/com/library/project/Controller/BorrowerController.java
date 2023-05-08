package com.library.project.Controller;

import com.library.project.Dto.BorrowerDto;
import com.library.project.Service.BorrowerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BorrowerController {
    private final BorrowerService borrowerService;

    public BorrowerController(BorrowerService borrowerService) {
        this.borrowerService = borrowerService;
    }

    @RequestMapping(value = "/add-user", method = {RequestMethod.GET, RequestMethod.POST})
    public String showAddUserPage (@ModelAttribute (value = "borrower")BorrowerDto borrowerDto){
        return "addUser";
    }

}
