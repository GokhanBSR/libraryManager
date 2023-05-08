package com.library.project.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDto {

    /**
     * uuid info
     */
    private UUID uuid;

    /**
     * state information. deleted 0, undeleted 1
     */
    private short state=1;

    /**
     * version information
     */
    private long version;


}
