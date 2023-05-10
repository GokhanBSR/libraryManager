package com.library.project.common.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {

    /**
     * Entity primaryKey ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * State of entity
     * deleted = 0, undeleted=1
     */
    @Column(name = "state", nullable = false)
    private short state = 1;

    /**
     * Entity Version
     */
    @Version
    @Column(name = "version", nullable = false)
    private Long version;

}
