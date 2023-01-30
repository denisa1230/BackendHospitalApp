package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String drugName;

    private Float price;

    public Drug() {
    }

    public Drug(Integer id, String drugName, Float price) {
        this.id = id;
        this.drugName = drugName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
