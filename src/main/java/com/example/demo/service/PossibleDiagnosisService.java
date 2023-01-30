package com.example.demo.service;

import com.example.demo.controller.DrugController;
import com.example.demo.entity.Drug;
import com.example.demo.entity.PossibleDiagnosis;
import com.example.demo.repository.DrugRepository;
import com.example.demo.repository.PossibleDiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PossibleDiagnosisService{
    @Autowired
    private PossibleDiagnosisRepository possibleDiagnosisRepository;

    public void saveDiagnosis(PossibleDiagnosis diagnosis) {
        possibleDiagnosisRepository.save(diagnosis);
    }

    public PossibleDiagnosis getDiagnosisByDetails(String details) {
        return possibleDiagnosisRepository.findByDetails(details);
    }
}
