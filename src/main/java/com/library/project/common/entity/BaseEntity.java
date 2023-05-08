package com.library.project.common.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {

    /**
     * (Book and Borrower) Entity primaryKey ID
     */
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * (Book and Borrower) Entity Created Date
     */
    @CreatedDate
    @Column(name = "create_date", nullable = false, updatable = false)
    private LocalDateTime createDate;

    /**
     * (Book and Borrower) Entity Created By
     */
    @CreatedBy
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdUser;

    /**
     * Entity Update Date
     */
    @LastModifiedDate
    @Column(name = "update_date")
    private LocalDateTime updateDate;

    /**
     * Entity Updated By
     */
    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedUser;

    /**
     * State of entity
     * deleted = 0, undeleted=1
     */
    @Column(name = "state", nullable = false)
    private short state=1;

    /**
     * Entity Version
     */
    @Version
    @Column(name = "version", nullable = false)
    private Long version;

}
