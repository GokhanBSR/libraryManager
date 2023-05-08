package com.library.project.common.service.implement;

import com.library.project.common.dto.BaseDto;
import com.library.project.common.entity.BaseEntity;
import com.library.project.common.mapper.BaseMapper;
import com.library.project.common.repository.BaseRepository;
import com.library.project.common.service.BaseServiceInterface;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public abstract class BaseService<
        RepositoryType extends BaseRepository<EntityType, UUID>,
        MapperType extends BaseMapper<DtoType, EntityType>,
        EntityType extends BaseEntity,
        DtoType extends BaseDto> implements BaseServiceInterface <DtoType>

        {
            protected final RepositoryType repository;
            public DtoType save(DtoType dto){
return null;
            }

        }
