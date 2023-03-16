package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
    @PostMapping("saveDiagnostic")
    public void saveDiagnosticById(@RequestBody Consultation diagnostic) {
        consultationService.saveDiagnostic(diagnostic);
    }
}
