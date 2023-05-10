package com.library.project.common.mapper;

import com.library.project.common.dto.BaseDto;
import com.library.project.common.entity.BaseEntity;

import java.util.List;
import java.util.Set;


public interface BaseMapper<T1 extends BaseDto, T2 extends BaseEntity> {
    /**
     * BaseEntity extend alan entity parametre alır. BaseDto extend alan dto döner.
     *
     * @param entity BaseEntity'den extend olan entity parametre alır
     * @return dto BaseDto'dan extend olan dto döner.
     */
    T1 entityToDto(T2 entity);

    /**
     * BaseDto'dan extend olan Dto nesnesi alıp entity döner
     *
     * @param dto BaseDto'dan extend olan Dto nesnesini parametre alır
     * @return BaseEntity'den extend olan entity'yi döner.
     */
    T2 dtoToEntity(T1 dto);

    /**
     * @param entitySet
     * @return
     */
    Set<T1> dtoSetToEntitySet(Set<T2> entitySet);

    /**
     * @param entitySet
     * @return
     */
    Set<T1> entitySetToDtoSet(Set<T2> entitySet);

    /**
     * @param entityList
     * @return
     */
    List<T2> dtoListToEntityList(List<T1> entityList);

    /**
     * @param entityList
     * @return
     */
    List<T1> entityListToDtoList(List<T2> entityList);
}
