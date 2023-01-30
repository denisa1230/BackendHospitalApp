package com.example.demo.controller;

import com.example.demo.entity.Patient;
import com.example.demo.entity.Prescription;
import com.example.demo.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PrescriptionController {
    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping("getPrescription")
    public List<Prescription> getPrescriptionByPacient(Patient patient)
    {
        return prescriptionService.getPrescriptionByPacient(patient);
    }
}
