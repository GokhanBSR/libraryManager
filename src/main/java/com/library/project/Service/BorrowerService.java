package com.library.project.Service;

import com.library.project.Dto.BorrowerDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.UUID;

public interface BorrowerService extends UserDetailsService {

    BorrowerDto addBorrower (BorrowerDto borrowerDto);

//    BorrowerDto getBorrower (BorrowerDto borrowerDto);

    List<BorrowerDto> findByNameSurname(BorrowerDto borrowerDto);
    List<BorrowerDto> findByUuid(BorrowerDto borrowerDto);
    List<BorrowerDto> findByEmail (BorrowerDto borrowerDto);
    List<BorrowerDto> findByPhoneNumber (BorrowerDto borrowerDto);

    void delete (BorrowerDto borrowerDto);
    void deleteByid(UUID uuid);


}
