package com.library.project.common.service;

import com.library.project.common.dto.BaseDto;

import java.util.List;
import java.util.UUID;

public interface BaseServiceInterface<DtoType extends BaseDto> {

    DtoType save(DtoType dtoType);

    List<DtoType> saveAll(List<DtoType> dtoTypes);

    List<DtoType> findAll();

    DtoType findById(UUID uuid);

    void delete(DtoType dtoType);


}
