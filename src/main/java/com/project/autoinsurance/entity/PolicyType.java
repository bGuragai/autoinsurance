package com.project.autoinsurance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "policy_type")
public class PolicyType {
    @Id
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @Column(name = "TYPE_TXT", nullable = false, length = 25)
    private String typeTxt;

    @Column(name = "CREATED_DTS")
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS")
    private Instant lastUpdatedDts;

}