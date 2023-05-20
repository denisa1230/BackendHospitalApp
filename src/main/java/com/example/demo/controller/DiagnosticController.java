package com.example.demo.controller;

import com.example.demo.entity.Diagnostic;
import com.example.demo.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Month;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/diagnostic")
public class DiagnosticController {
    @Autowired
    DiagnosticService diagnosticService ;

    public DiagnosticController() {
        diagnosticService = new DiagnosticService();
    }

    @GetMapping("getPossibleDiagnosisByDetails/{details}")
    public Diagnostic getPossibleDiagnosisByDetails(@PathVariable String details) {
        return diagnosticService.getDiagnosisByDetails(details);
    }
    @GetMapping("findAllDiagnosis")
    public List<Diagnostic> findAll(){
       return diagnosticService.findAllDiagnostic();
    }

    @PostMapping("saveDiagnostic")
    public void savePossibleDiagnosis(@RequestBody Diagnostic diagnostic) {
        diagnosticService.saveDiagnosis(diagnostic);
    }
    @GetMapping(value="/deleteDiagnostic/{id}")
    public void deleteDiagnostic(@PathVariable Integer id){
        diagnosticService.deleteDiagnostic(id);
    }

    @PostMapping(value="/updateDiagnostic")
    public void updateDiagnostic(@RequestBody Diagnostic possibleDiagnosis){
        diagnosticService.updateDiagnostic(possibleDiagnosis, possibleDiagnosis.getIdDiagnostic());
    }


}
