package com.library.project.common.service.implement;

import com.library.project.common.dto.BaseDto;
import com.library.project.common.entity.BaseEntity;
import com.library.project.common.mapper.BaseMapper;
import com.library.project.common.repository.BaseRepository;
import com.library.project.common.service.BaseServiceInterface;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public abstract class BaseService<
        RepositoryType extends BaseRepository<EntityType, UUID>,
        MapperType extends BaseMapper<DtoType, EntityType>,
        EntityType extends BaseEntity,
        DtoType extends BaseDto> implements BaseServiceInterface<DtoType> {
    protected final MapperType mapper;
    protected final RepositoryType repository;

    public DtoType save(DtoType dto) {
        return mapper.entityToDto(repository.save(mapper.dtoToEntity(dto)));
    }

    public List<DtoType> saveAll(List<DtoType> dtoTypeList) {
        return mapper.entityListToDtoList(repository.saveAll(mapper.dtoListToEntityList(dtoTypeList)));
    }

    public List<DtoType> findAll() {

        return mapper.entityListToDtoList(repository.findAll());

    }

    public DtoType findById(UUID uuid) {

        return mapper.entityToDto(repository.findById(uuid).orElseThrow(() -> new RuntimeException("can not find")));
    }

    public void delete(DtoType dto) {

        repository.delete(mapper.dtoToEntity(dto));
    }

    public void deleteById(UUID uuid) {

        repository.deleteById(uuid);
    }

    public void deleteAll(List<DtoType> dtoTypeList) {

        repository.deleteAll(mapper.dtoListToEntityList(dtoTypeList));
    }


}

