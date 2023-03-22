package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @GetMapping ("getPatient/{firstName}")
    public Patient getPatientByFirstName(@PathVariable String firstName){
        return  patientService.getByFirstName(firstName);
    }
    @GetMapping("getPatientByAccount/{email}")
    public Patient  getPatientByAccount(@PathVariable String email) {
        return patientService.getPatientByAccount(email);
    }
    @GetMapping("getAllPatient")
    public List<Patient> getAllPatient() {
        return patientService.getAllPatient();
    }

    @PostMapping(value="/updatePatient")
    public void updatePatient(@RequestBody Patient patient){
        patientService.updatePatient(patient, patient.getIdPatient());
    }
}
