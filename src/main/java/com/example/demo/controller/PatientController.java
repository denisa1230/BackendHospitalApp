package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;
    @GetMapping ("getPatient/{firstName}")
    public Patient getPatientByFirstName(@PathVariable String firstName){
        return  patientService.getByFirstName(firstName);
    }
    @GetMapping("getAllPatient")
    public List<Patient> getAllPatient() {
        return patientService.getAllPatient();
    }
}
