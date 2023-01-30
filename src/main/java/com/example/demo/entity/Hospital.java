package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Hospital {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idHospital;

    private String name;

    private String locality;

    private String county;

    public Hospital() {
    }

    public Hospital(Integer idHospital, String name, String locality, String county) {
        this.idHospital = idHospital;
        this.name = name;
        this.locality = locality;
        this.county = county;
    }

    public Integer getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Integer idHospital) {
        this.idHospital = idHospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
