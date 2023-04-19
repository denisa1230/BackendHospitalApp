package com.example.demo.service;

import com.example.demo.dto.ConsultationDto;
import com.example.demo.entity.Consultation;
import com.example.demo.entity.ConsultationMedicine;
import com.example.demo.entity.Drug;
import com.example.demo.repository.ConsultationMedicineRepository;
import com.example.demo.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationMedicineService {
    @Autowired
    private ConsultationMedicineRepository consultationMedicineRepository;

    @Autowired
    private ConsultationRepository consultationRepository;

    public void saveConsultation(Consultation consultation, List<Drug> drugs) {
        Consultation consultation1 = consultationRepository.save(consultation);

        for (int i = 0; i < drugs.size(); i++) {
          consultationMedicineRepository.save(new ConsultationMedicine(drugs.get(i), consultation1));
        }
    }
}
