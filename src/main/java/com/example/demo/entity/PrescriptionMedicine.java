package com.example.demo.entity;

import javax.persistence.*;

@Entity

public class PrescriptionMedicine {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idDrug")
    private Drug drug;
    @ManyToOne
    @JoinColumn(name = "idPrescription")
    private Prescription prescription;

    public PrescriptionMedicine(Integer id, Drug drug, Prescription prescription) {
        this.id = id;
        this.drug = drug;
        this.prescription = prescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
