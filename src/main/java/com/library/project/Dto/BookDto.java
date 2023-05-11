package com.library.project.Dto;

import com.library.project.common.dto.BaseDto;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String author;

    /**
     * dto book title info
     */
    @NotBlank
    private String title;

    /**
     * dto book isbn info
     */
    private String isbn;

    /**
     * dto book is enable or not
     */
    private boolean isEnable = true;

}
