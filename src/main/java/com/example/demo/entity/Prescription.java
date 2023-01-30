package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idPrescripton;
    private Date date;

    @ManyToOne
    @JoinColumn(name="idPatient")
    private Patient patient;

    public Prescription() {
    }

    public Prescription(Integer idPrescripton, Date date, Patient patient) {
        this.idPrescripton = idPrescripton;
        this.date = date;
        this.patient = patient;
    }

    public Integer getIdPrescripton() {
        return idPrescripton;
    }

    public void setIdPrescripton(Integer idPrescripton) {
        this.idPrescripton = idPrescripton;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
