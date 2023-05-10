package com.library.project.Service.mapper;

import com.library.project.Dto.BookDto;
import com.library.project.Entity.Book;
import com.library.project.common.mapper.BaseMapper;
import org.mapstruct.*;

import java.util.UUID;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface BookMapper extends BaseMapper<BookDto, Book> {


}
