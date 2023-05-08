package com.library.project.Dto;

import com.library.project.common.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto extends BaseDto {

    /**
     * dto book author info
     */
    private String author;

    /**
     * dto book title info
     */
    private String title;

    /**
     * dto book isbn info
     */
    private String isbn;

    /**
     * dto book is enable or not
     */
    private boolean isEnable=true;


}
