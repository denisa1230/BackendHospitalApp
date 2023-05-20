package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.entity.ConsultationMedicine;
import com.example.demo.entity.Diagnostic;
import com.example.demo.entity.Drug;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.ConsultationRepository;
import com.example.demo.repository.DrugRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
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


    public void deleteDiagnostic(Consultation diagnostic) {
        consultationRepository.delete(diagnostic);
    }

    public List<Consultation> getDiagnosticByAppointment(Appointment appointment) {
        return consultationRepository.getConsultationByAppointment(appointment);
    }

    public void saveConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    public List<Consultation> getConsultationByEmail(String email) {

        List<Consultation> consultations = consultationRepository.findAll();
        List<Consultation> consultationPatient = new ArrayList<>();
        for (int i = 0; i < consultations.size(); i++) {
            if (consultations.get(i).getAppointment().getPatient().getEmail().equals(email)) {
                consultationPatient.add(consultations.get(i));
            }
        }
        return consultationPatient;
    }

    public List<Consultation> findAllConsultation() {
        return consultationRepository.findAll();
    }

    public HashMap<Month, Integer> countDiagnosticByMount() {
        List<Consultation> consultations = consultationRepository.findAll();
        HashMap<Month, Integer> consultationMap = new HashMap<>();
        for (int i = 0; i < consultations.size(); i++) {
            Month consultationMounth = consultations.get(i).getAppointment().getDate().getMonth();
            if (consultationMap.get(consultationMounth) != null) {
                consultationMap.put(consultationMounth, consultationMap.get(consultationMounth) + 1);
            } else {
                consultationMap.put(consultationMounth, 1);
            }
        }
        return consultationMap;
    }

    public HashMap<String, Integer> countDiagnostic()
    {
       List<Consultation> consultations=consultationRepository.findAll();
        HashMap<String, Integer> diagnosticMap= new HashMap<>();
        for (int i=0;i< consultations.size();i++)
        {
            String diagnosticName= consultations.get(i).getDiagnostic().getName();
            if (diagnosticMap.get(diagnosticName)!= null){
                diagnosticMap.put(diagnosticName, diagnosticMap.get(diagnosticName)+1);
            }
            else{
                diagnosticMap.put(diagnosticName, 1);
            }
        }
        return  diagnosticMap;
    }
}
