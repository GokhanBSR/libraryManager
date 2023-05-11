package com.library.project.Dto;

import com.library.project.common.dto.BaseDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BorrowerDto extends BaseDto {

    /**
     * dto username info
     */
    @NotBlank
    @Size(min = 5, max = 100)
    private String name;

    /**
     * dto email info
     */
    @Email
    @NotBlank
    @Size(min = 6, max = 30)
    private String email;

    /**
     * dto phone number info
     */
    @Size(min = 6, max = 20)
    private String phoneNumber;

}
