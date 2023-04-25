package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.ConsultationRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
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

    public void saveConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }
    public List<Consultation> getConsultationByEmail(String email){

        List<Consultation> consultations= consultationRepository.findAll();
        List<Consultation> consultationPatient=new ArrayList<>();
        for (int i=0;i<consultations.size();i++) {
            if (consultations.get(i).getAppointment().getPatient().getEmail().equals(email)) {
                consultationPatient.add(consultations.get(i));
            }
        }
        return consultationPatient;
    }

}
