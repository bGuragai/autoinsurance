package com.project.autoinsurance.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;


@Entity
public class Policy {

    @Column(name = "POLICY_NUMBER", nullable = false)
    private Long policyNumber;

    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private Long accountNumber;

    @Column(name = "TYPE_CD", nullable = false)
    private Boolean typeCd = false;

    @Column(name = "NAME", nullable = false, length = 45)
    private String name;

    @Column(name = "EFFECTIVE_DATE", nullable = false)
    private LocalDate effectiveDate;

    @Column(name = "EXPIRATION_DATE", nullable = false)
    private LocalDate expirationDate;

    @Column(name = "CANCEL_DATE", nullable = false)
    private LocalDate cancelDate;

    @Column(name = "TERM")
    private Short term;

    @Column(name = "PREMIUM_AMOUNT", nullable = false, length = 10)
    private String premiumAmount;

    @Column(name = "CREATED_DTS")
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS")
    private Instant lastUpdatedDts;

    public Policy() {
    }

    @Id @Setter @Getter
    private Long id;

    @Getter @Setter
    private String Type;

    @Getter @Setter
    private String Coverage;

    @Getter @Setter
    private int Bill;

    @Setter @Getter
    private Date policyCreatedAt;

    @Setter @Getter
    private Date policyUpdatedAt;

    public Instant getLastUpdatedDts() {
        return lastUpdatedDts;
    }

    public void setLastUpdatedDts(Instant lastUpdatedDts) {
        this.lastUpdatedDts = lastUpdatedDts;
    }

    public Instant getCreatedDts() {
        return createdDts;
    }

    public void setCreatedDts(Instant createdDts) {
        this.createdDts = createdDts;
    }

    public String getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(String premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Short getTerm() {
        return term;
    }

    public void setTerm(Short term) {
        this.term = term;
    }

    public LocalDate getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDate cancelDate) {
        this.cancelDate = cancelDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(Boolean typeCd) {
        this.typeCd = typeCd;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Long policyNumber) {
        this.policyNumber = policyNumber;
    }


}
