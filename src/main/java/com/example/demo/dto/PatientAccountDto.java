package com.example.demo.dto;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

import java.util.Date;

public class PatientAccountDto {
    private String email;
    private String password;
    private Patient patient;

    public PatientAccountDto() {
    }

    public PatientAccountDto(String email, String password, Patient patient) {
        this.email = email;
        this.password = password;
        this.patient = patient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
