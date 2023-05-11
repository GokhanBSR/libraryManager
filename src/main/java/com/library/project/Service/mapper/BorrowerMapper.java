package com.library.project.Service.mapper;

import com.library.project.Dto.BorrowerDto;
import com.library.project.Entity.Borrower;
import com.library.project.common.mapper.BaseMapper;
import org.mapstruct.*;
import org.springframework.util.CollectionUtils;

@Mapper(componentModel = "spring",uses = {BookMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface BorrowerMapper extends BaseMapper<BorrowerDto, Borrower> {

    @AfterMapping
    default void setParentToChild(@MappingTarget Borrower borrower) {
        if (!CollectionUtils.isEmpty(borrower.getBookList())){
            borrower.getBookList().forEach(book ->{
                book.setBorrower(borrower);
            });
        }
    }
}
