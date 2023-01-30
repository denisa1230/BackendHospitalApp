package com.example.demo.controller;

import com.example.demo.entity.PossibleDiagnosis;
import com.example.demo.service.PossibleDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PossibleDiagnosisController {
    @Autowired
    PossibleDiagnosisService possibleDiagnosisService ;

    public PossibleDiagnosisController() {
        possibleDiagnosisService = new PossibleDiagnosisService();
    }

    @GetMapping("getPossibleDiagnosisByDetails/{details}")
    public PossibleDiagnosis getPossibleDiagnosisByDetails(@PathVariable String details) {
        return possibleDiagnosisService.getDiagnosisByDetails(details);
    }

    @PostMapping("savePossibleDiagnosis")
    public void savePossibleDiagnosis(@RequestBody PossibleDiagnosis possiblediagnosis) {
        possibleDiagnosisService.saveDiagnosis(possiblediagnosis);
    }

}
