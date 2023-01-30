package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.sql.Select;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSection;
    private String name;
    @ManyToOne
    @JoinColumn(name = "idHospital")
    private Hospital hospital;

    private Section() {
    }

    public Section(Integer idSection, String name) {
        this.idSection = idSection;
        this.name = name;
    }

    public Integer getIdSection() {
        return idSection;
    }

    public void setIdSection(Integer idSection) {
        this.idSection = idSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}
