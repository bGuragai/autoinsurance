package com.project.autoinsurance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "smallint UNSIGNED not null")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BILL_ID", nullable = false)
    private Bill bill;

    @Column(name = "PAID_DATE", nullable = false)
    private LocalDate paidDate;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Column(name = "PAYMENT_METHOD", nullable = false, length = 25)
    private String paymentMethod;

    @Column(name = "PAYER_FIRST_NAME", length = 10)
    private String payerFirstName;

    @Column(name = "PAYER_LAST_NAME", length = 10)
    private String payerLastName;

    @Column(name = "CARD_NUMBER", length = 50)
    private String cardNumber;

    @Column(name = "ZIPCODE", nullable = false, length = 10)
    private String zipcode;

    @Column(name = "CARD_EXPIRATION_DATE")
    private LocalDate cardExpirationDate;

    @Column(name = "CARD_TYPE", length = 25)
    private String cardType;

    @Column(name = "DEBIT_OR_CREDIT", length = 25)
    private String debitOrCredit;

    @Column(name = "BANK_NAME", length = 25)
    private String bankName;

    @Column(name = "ACCOUNT_NUMBER", length = 25)
    private String accountNumber;

    @Column(name = "ROUTING_NUMBER", length = 25)
    private String routingNumber;

    @Column(name = "CHECK_NUMBER")
    private Short checkNumber;

    @Column(name = "CHECK_IMAGE")
    private byte[] checkImage;

    @Column(name = "CREATED_DTS", nullable = false)
    private Instant createdDts;

    @Column(name = "LAST_UPDATED_DTS", nullable = false)
    private Instant lastUpdatedDts;

}