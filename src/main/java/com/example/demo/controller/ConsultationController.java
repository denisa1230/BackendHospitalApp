package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/consultation")
public class ConsultationController {
    @Autowired
    ConsultationService consultationService;

    @DeleteMapping("delete")
    public void delete (@RequestBody Consultation diagnostic){
        consultationService.deleteDiagnostic(diagnostic);
    }
    @GetMapping("getDiagnostic")
    public List<Consultation>  getDiagnosticByAppointment(@RequestBody Appointment appointment){
        return consultationService.getDiagnosticByAppointment(appointment);

    }
    @PostMapping("saveConsultation")
    public void saveConsultation(@RequestBody Consultation consultation) {
        consultationService.saveConsultation(consultation);
    }
    @GetMapping("getConsultationByUsername/{email}")
    public List<Consultation> getConsultationByUsername(@PathVariable String email)
    {
        return consultationService.getConsultationByEmail(email);
    }
}
