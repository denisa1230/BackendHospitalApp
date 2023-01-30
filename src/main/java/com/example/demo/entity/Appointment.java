package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAppoiment;
    private Date date;

    @ManyToOne
    @JoinColumn(name="idDoctor")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name="idPatient")
    private Patient patient;

    public Appointment() {
    }

    public Appointment(Integer idAppoiment, Date date, Doctor doctor, Patient patient) {
        this.idAppoiment = idAppoiment;
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Integer getIdAppoiment() {
        return idAppoiment;
    }

    public void setIdAppoiment(Integer idAppoiment) {
        this.idAppoiment = idAppoiment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
