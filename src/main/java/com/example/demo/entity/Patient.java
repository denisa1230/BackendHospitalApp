package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPatient;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "idAccount")
    private Account account;

    public Patient() {
    }

    public Patient(Integer idPatient, String firstName, String lastName,Account account) {
        this.idPatient = idPatient;
        this.firstName = firstName;
        this.lastName = lastName;

        this.account = account;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
