package com.library.project.Service.mapper;

import com.library.project.Dto.BookDto;
import com.library.project.Entity.Book;
import com.library.project.common.mapper.BaseMapper;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.util.CollectionUtils;

import java.util.UUID;

@Mapper
public interface BookMapper extends BaseMapper<BookDto, Book> {
    Book toEntity(UUID uuid);
//Sonradan düzenlenecek
    @AfterMapping
    default void setParentToChild (@MappingTarget Book book){
//        if (!CollectionUtils.isEmpty(book.getBorrower())){
//            book.getBorrower().forEach(Borrewer ->{
//                borrower.setBook(book);
//            });
//        }
    }
}
