package com.example.demo.entity;

import javax.persistence.*;

@Entity

public class ConsultationMedicine {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idConsultationMedicine;
    @ManyToOne
    @JoinColumn(name = "idDrug")
    private Drug drug;

    @ManyToOne
    @JoinColumn(name = "idConsultation")
    private Consultation consultation;


    public ConsultationMedicine() {
    }

    public ConsultationMedicine(Integer idConsultationMedicine, Drug drug, Consultation consultation) {
        this.idConsultationMedicine = idConsultationMedicine;
        this.drug = drug;
        this.consultation = consultation;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public Integer getIdConsultationMedicine() {
        return idConsultationMedicine;
    }

    public void setIdConsultationMedicine(Integer idConsultationMedicine) {
        this.idConsultationMedicine = idConsultationMedicine;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }


}
