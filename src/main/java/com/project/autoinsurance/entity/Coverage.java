package com.project.autoinsurance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "coverage")
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @Column(name = "COVERAGE_GROUP", length = 10)
    private String coverageGroup;

    @Column(name = "COVERAGE_DESCRIPTION", length = 50)
    private String coverageDescription;

    @Column(name = "COVERAGE_CODE", nullable = false, length = 5)
    private String coverageCode;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}