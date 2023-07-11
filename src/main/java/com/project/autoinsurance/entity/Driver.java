package com.project.autoinsurance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @Column(name = "STATUS_CD", nullable = false)
    private Boolean statusCd = false;

    @Column(name = "POLICY_ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer policyId;

    @Column(name = "TITLE", length = 10)
    private String title;

    @Column(name = "FIRST_NAME", nullable = false, length = 25)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 25)
    private String lastName;

    @Column(name = "MIDDLE_INITIAL", nullable = false, length = 2)
    private String middleInitial;

    @Column(name = "DOB", nullable = false)
    private LocalDate dob;

    @Column(name = "EMAIL_ADDRESS", length = 50)
    private String emailAddress;

    @Column(name = "PHONE_ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer phoneId;

    @Column(name = "SSN", length = 50)
    private String ssn;

    @Column(name = "LICENSE_ISSUED_DATE", nullable = false)
    private LocalDate licenseIssuedDate;

    @Column(name = "LICENSED_ISSUED_STATE", nullable = false, length = 20)
    private String licensedIssuedState;

    @Column(name = "LICENSE_NUMBER", nullable = false, length = 20)
    private String licenseNumber;

    @Column(name = "IS_PRIMARY_POLICY_HOLDER")
    private Boolean isPrimaryPolicyHolder;

    @Column(name = "RELATION_WITH_PRIMARY_POLICY_HOLDER", nullable = false, length = 25)
    private String relationWithPrimaryPolicyHolder;

    @Column(name = "GENDER", length = 25)
    private String gender;

    @Column(name = "MARITAL_STATUS", nullable = false, length = 25)
    private String maritalStatus;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}