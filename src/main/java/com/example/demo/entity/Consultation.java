package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idConsultation;
    private String details;
    @ManyToOne
    @JoinColumn(name = "idAppointment")
    private Appointment appointment;
    @ManyToOne
    @JoinColumn(name = "idDiagnostic")
    private Diagnostic diagnostic;

    public Consultation() {
    }

    public Consultation(Integer idConsultation, String details, Appointment appointment, Diagnostic diagnostic) {
        this.idConsultation = idConsultation;
        this.details = details;
        this.appointment = appointment;
        this.diagnostic = diagnostic;
    }

    public Integer getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(Integer idConsultation) {
        this.idConsultation = idConsultation;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }
}
