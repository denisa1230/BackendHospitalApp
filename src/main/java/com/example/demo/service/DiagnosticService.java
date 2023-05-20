package com.example.demo.service;

import com.example.demo.entity.Diagnostic;
import com.example.demo.repository.DiagnosticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.List;

@Service
public class DiagnosticService {
    @Autowired
    private DiagnosticRepository diagnosticRepository;

    public void saveDiagnosis(Diagnostic diagnosis) {
        diagnosticRepository.save(diagnosis);
    }

    public Diagnostic getDiagnosisByDetails(String details) {
        return diagnosticRepository.findByDetails(details);
    }
    public List<Diagnostic> findAllDiagnostic()
    {
        return diagnosticRepository.findAll();
    }
    public void deleteDiagnostic(Integer id)
    {
        List<Diagnostic> diagnostics=diagnosticRepository.findAll();
        for (Diagnostic d :diagnostics)
        {
            if (d.getIdDiagnostic()== id){
                diagnosticRepository.delete(d);
            }
        }
    }
    public Diagnostic updateDiagnostic (Diagnostic diagnostic, Integer idDiagnostic) {
        Diagnostic diagnostic1 = diagnosticRepository.findByIdDiagnostic(idDiagnostic);
        diagnostic1.setIdDiagnostic(diagnostic.getIdDiagnostic());
        diagnostic1.setName(diagnostic.getName());
        diagnostic1.setDetails(diagnostic.getDetails());
        diagnostic1.setStatus(diagnostic.getStatus());
        return diagnosticRepository.save(diagnostic1);
    }


}
