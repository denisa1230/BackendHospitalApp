package com.example.demo.service;

import com.example.demo.entity.Patient;
import com.example.demo.entity.Prescription;
import com.example.demo.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PrescriptionService {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    public List<Prescription> getPrescriptionByPacient (Patient patient)
    {
        return prescriptionRepository.getPrescriptionByPatient(patient);
    }
}
