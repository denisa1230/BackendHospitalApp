package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAppoiment;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    private Integer hour;
    private String status;
    @ManyToOne
    @JoinColumn(name = "idDoctor")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;


    public Appointment(Integer idAppoiment, LocalDate date, Doctor doctor, Patient patient,String status) {
        this.idAppoiment = idAppoiment;
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.status = status;
    }

    public Appointment() {
    }

    public Integer getIdAppoiment() {
        return idAppoiment;
    }

    public void setIdAppoiment(Integer idAppoiment) {
        this.idAppoiment = idAppoiment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
