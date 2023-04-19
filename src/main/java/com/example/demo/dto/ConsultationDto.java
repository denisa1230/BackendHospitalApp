package com.example.demo.dto;

import com.example.demo.entity.Consultation;
import com.example.demo.entity.ConsultationMedicine;
import com.example.demo.entity.Drug;

import java.util.List;

public class ConsultationDto {

    private List<Drug> drugs;

    private Consultation consultation;

    public ConsultationDto() {
    }

    public ConsultationDto(List<Drug> drugs, Consultation consultation) {
        this.drugs = drugs;
        this.consultation = consultation;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
