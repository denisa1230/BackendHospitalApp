package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idDrug;

    private String drugName;

    private String dosage;
    private String status;

    public Drug() {
    }

    public Drug(Integer idDrug, String drugName, String dosage, String status) {

        this.idDrug = idDrug;
        this.drugName = drugName;
        this.dosage = dosage;
        this.status=status;
    }

    public Integer getIdDrug() {
        return idDrug;
    }

    public void setIdDrug(Integer idDrug) {
        this.idDrug = idDrug;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
