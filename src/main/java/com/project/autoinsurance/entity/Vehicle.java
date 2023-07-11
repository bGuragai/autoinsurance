package com.project.autoinsurance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @Column(name = "STATUS", nullable = false)
    private Boolean status = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private Policy policy;

    @Column(name = "YEAR", length = 4)
    private String year;

    @Column(name = "MAKE", nullable = false, length = 25)
    private String make;

    @Column(name = "MODEL", nullable = false, length = 25)
    private String model;

    @Column(name = "COLOR", length = 2)
    private String color;

    @Column(name = "TRIM", length = 25)
    private String trim;

    @Column(name = "MILEAGE")
    private Integer mileage;

    @Column(name = "VIN_NUMBER", nullable = false, length = 20)
    private String vinNumber;

    @Column(name = "NUMBER_PLATE", length = 10)
    private String numberPlate;

    @Column(name = "REGISTERED_STATE", length = 25)
    private String registeredState;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}