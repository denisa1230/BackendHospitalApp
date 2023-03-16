package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.ConsultationRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ConsultationService {
    @Autowired
   private ConsultationRepository consultationRepository;
    @Autowired
   private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientService patientService;
    @Autowired
    private PatientRepository patientRepository;

    public void deleteDiagnostic(Consultation diagnostic)
    {
        consultationRepository.delete(diagnostic);
    }
    public List<Consultation> getDiagnosticByAppointment(Appointment appointment)
    {
        return consultationRepository.getConsultationByAppointment(appointment);
    }

    public void saveDiagnostic(Consultation diagnostic) {
        consultationRepository.save(diagnostic);
    }

}
