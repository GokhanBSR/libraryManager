package com.library.project.Service.implement;

import com.library.project.Dto.BorrowerDto;
import com.library.project.Entity.Borrower;
import com.library.project.Repository.BorrowerRepository;
import com.library.project.Service.BorrowerService;
import com.library.project.Service.mapper.BorrowerMapper;
import com.library.project.common.service.implement.BaseService;
import org.springframework.stereotype.Service;

@Service  // spring stereotype
public class BorrewerServiceImplement extends BaseService<BorrowerRepository, BorrowerMapper, Borrower, BorrowerDto> implements BorrowerService {

    private final BorrowerRepository borrowerRepository;  //constructor injection
    private final BorrowerMapper borrowerMapper;  //constructor injection

    public BorrewerServiceImplement(BorrowerMapper mapper, BorrowerRepository repository,
                                    BorrowerRepository borrowerRepository, BorrowerMapper borrowerMapper) {
        super(mapper, repository);
        this.borrowerRepository = borrowerRepository;
        this.borrowerMapper = borrowerMapper;
    }

    @Override
    public BorrowerDto addBorrower(BorrowerDto borrowerDto) {
        return super.save(borrowerDto);
    }

    @Override
    public void removeBorrower(BorrowerDto borrowerDto) {
        super.deleteById(borrowerDto.getUuid());
    }

    @Override
    public BorrowerDto getBorrower(BorrowerDto borrowerDto) {
        return borrowerMapper.entityToDto(borrowerRepository.findByEmail(borrowerDto.getEmail()));
    }

}
