package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Diagnostic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDiagnostic;
    private String name;
    private String details;
    @ManyToOne
    @JoinColumn(name = "idAppointment")
    private Appointment appointment;
    @ManyToOne
    @JoinColumn(name = "idPossibleDiagnosis")
    private PossibleDiagnosis possibleDiagnosis;

    public Diagnostic() {
    }

    public Diagnostic(Integer idDiagnostic, String name, String details, Appointment appointment, PossibleDiagnosis possibleDiagnosis) {
        this.idDiagnostic = idDiagnostic;
        this.name = name;
        this.details = details;
        this.appointment = appointment;
        this.possibleDiagnosis = possibleDiagnosis;
    }

    public Integer getIdDiagnostic() {
        return idDiagnostic;
    }

    public void setIdDiagnostic(Integer idDiagnostic) {
        this.idDiagnostic = idDiagnostic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public PossibleDiagnosis getPossibleDiagnosis() {
        return possibleDiagnosis;
    }

    public void setPossibleDiagnosis(PossibleDiagnosis possibleDiagnosis) {
        this.possibleDiagnosis = possibleDiagnosis;
    }
}
