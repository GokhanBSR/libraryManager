package com.library.project.Service.mapper;

import com.library.project.Dto.BorrowerDto;
import com.library.project.Entity.Borrower;
import com.library.project.common.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper
public interface BorrowerMapper extends BaseMapper<BorrowerDto, Borrower> {

}
