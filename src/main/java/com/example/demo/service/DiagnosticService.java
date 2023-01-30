package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Diagnostic;
import com.example.demo.entity.Drug;
import com.example.demo.entity.PossibleDiagnosis;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DiagnosticRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiagnosticService {
    @Autowired
   private DiagnosticRepository diagnosticRepository;
    @Autowired
   private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientService patientService;
    @Autowired
    private PatientRepository patientRepository;

    public void deleteDiagnostic(Diagnostic diagnostic)
    {
        diagnosticRepository.delete(diagnostic);
    }
    public List<Diagnostic> getDiagnosticByAppointment(Appointment appointment)
    {
        return diagnosticRepository.getDiagnosticByAppointment(appointment);
    }

    public void saveDiagnostic(Diagnostic diagnostic) {
        diagnosticRepository.save(diagnostic);
    }

}
