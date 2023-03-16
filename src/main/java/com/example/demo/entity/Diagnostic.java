package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diagnostic {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idDiagnostic;

    private String name;
    private String details;

    private String status;

    public Diagnostic() {
    }

    public Diagnostic(Integer idDiagnostic, String details, String name, String status) {
        this.idDiagnostic = idDiagnostic;
        this.details = details;
        this.name=name;
        this.status=status;
    }



    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdDiagnostic() {
        return idDiagnostic;
    }

    public void setIdDiagnostic(Integer idDiagnostic) {
        this.idDiagnostic = idDiagnostic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
