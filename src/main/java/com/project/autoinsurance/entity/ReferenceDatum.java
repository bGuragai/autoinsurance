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
@Table(name = "reference_data")
public class ReferenceDatum {
    @Id
    @Column(name = "REFERENCE_DATA_ID", nullable = false)
    private Integer id;

    @Column(name = "REFERENCE_DATA_CODE", nullable = false)
    private Integer referenceDataCode;

    @Column(name = "DESCRIPTION", nullable = false, length = 50)
    private String description;

    @Column(name = "ROW_CRTD_DTS")
    private Instant rowCrtdDts;

    @Column(name = "ROW_LAST_UPDTD_DTS")
    private Instant rowLastUpdtdDts;

}