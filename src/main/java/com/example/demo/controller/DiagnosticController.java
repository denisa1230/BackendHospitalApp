package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Diagnostic;
import com.example.demo.entity.Drug;
import com.example.demo.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class DiagnosticController {
    @Autowired
    DiagnosticService diagnosticService;

    @DeleteMapping("delete")
    public void delete (@RequestBody Diagnostic diagnostic){
         diagnosticService.deleteDiagnostic(diagnostic);
    }
    @GetMapping("getDiagnostic")
    public List<Diagnostic>  getDiagnosticByAppointment(@RequestBody Appointment appointment){
        return diagnosticService.getDiagnosticByAppointment(appointment);

    }
    @PostMapping("saveDiagnostic")
    public void saveDiagnosticById(@RequestBody Diagnostic diagnostic) {
        diagnosticService.saveDiagnostic(diagnostic);
    }
}
