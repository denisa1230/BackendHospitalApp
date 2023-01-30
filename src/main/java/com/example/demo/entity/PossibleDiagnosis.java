package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PossibleDiagnosis {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String details;


    public PossibleDiagnosis() {
    }

    public PossibleDiagnosis(Integer id, String details) {
        this.id = id;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
