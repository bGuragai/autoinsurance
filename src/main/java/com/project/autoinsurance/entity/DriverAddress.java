package com.project.autoinsurance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "driver_address")
public class DriverAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DRIVER_ID", nullable = false)
    private Driver driver;

    @Column(name = "STREET_NUMBER", nullable = false, length = 50)
    private String streetNumber;

    @Column(name = "STREET_NAME", length = 50)
    private String streetName;

    @Column(name = "CITY", length = 50)
    private String city;

    @Column(name = "STATE", nullable = false, length = 20)
    private String state;

    @Column(name = "POSTAL_CODE", length = 10)
    private String postalCode;

    @Column(name = "IS_GARAGE_ADDRESS", nullable = false)
    private Boolean isGarageAddress = false;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}