package com.project.autoinsurance.entity;

import com.project.autoinsurance.models.Policy;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "policy_renewable")
public class PolicyRenewable {
    @Id
    @Column(name = "ID", nullable = false, length = 20)
    private String id;

    @Column(name = "DATE_OF_RENEWAL", nullable = false)
    private LocalDate dateOfRenewal;

    @Column(name = "TYPE_OF_RENEWAL", nullable = false, length = 15)
    private String typeOfRenewal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private Policy policy;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}