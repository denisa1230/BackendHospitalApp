package com.example.demo.dto;

import com.example.demo.entity.Doctor;

public class DoctorAccountDto {
    private String email;
    private String password;
    private Doctor doctor;

    public DoctorAccountDto(String email, String password, Doctor doctor) {
        this.email = email;
        this.password = password;
        this.doctor = doctor;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
