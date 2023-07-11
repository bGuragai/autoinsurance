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
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private Policy policy;

    @Column(name = "BALANCE", nullable = false, length = 10)
    private String balance;

    @Column(name = "STATUS", nullable = false)
    private Boolean status = false;

    @Column(name = "DUE_DATE", nullable = false)
    private LocalDate dueDate;

    @Column(name = "MINIMUM_PAYMENT", length = 10)
    private String minimumPayment;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}