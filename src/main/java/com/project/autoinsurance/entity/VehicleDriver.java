package com.project.autoinsurance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "vehicle_driver")
public class VehicleDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VEHICLE_ID", nullable = false)
    private Vehicle vehicle;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DRIVER_ID", nullable = false)
    private Driver driver;

    @Column(name = "BUSINESS_PURPOSE", nullable = false, length = 25)
    private String businessPurpose;

    @Column(name = "IS_PRIMARY_DRIVER")
    private Boolean isPrimaryDriver;

    @Column(name = "EVERYDAY_MILEAGE")
    private Integer everydayMileage;

    @Column(name = "STATUS", nullable = false)
    private Boolean status = false;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}