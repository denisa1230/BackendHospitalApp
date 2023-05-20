package com.example.demo.service;

import com.example.demo.dto.ConsultationDto;
import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.entity.ConsultationMedicine;
import com.example.demo.entity.Drug;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.ConsultationMedicineRepository;
import com.example.demo.repository.ConsultationRepository;
import com.example.demo.repository.DrugRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ConsultationMedicineService {
    @Autowired
    private ConsultationMedicineRepository consultationMedicineRepository;

    @Autowired
    private ConsultationRepository consultationRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DrugRepository drugRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    public void saveConsultation(Consultation consultation, List<Drug> drugs) {
        consultation.getAppointment().setStatus("Consulted");
        appointmentRepository.save(consultation.getAppointment());
        Consultation consultation1 = consultationRepository.save(consultation);

        for (int i = 0; i < drugs.size(); i++) {
          consultationMedicineRepository.save(new ConsultationMedicine(drugs.get(i), consultation1));
        }
    }
    public List<String> getDrugs(Consultation consultation)
    {
        List<String> drugsName= new ArrayList<>();
        List<ConsultationMedicine> consultationMedicines=  consultationMedicineRepository.findByConsultation(consultation);
        for (int i=0;i<consultationMedicines.size();i++)
        {
           drugsName.add(consultationMedicines.get(i).getDrug().getDrugName());
        }
        return  drugsName;
    }
   public HashMap <String, Integer> getAllDrugs(){
       List <ConsultationMedicine> consultationMedicines=consultationMedicineRepository.findAll();
        HashMap<String,Integer> drugsMap= new HashMap<>();
        for (int i=0;i<consultationMedicines.size();i++){
            String drugName= consultationMedicines.get(i).getDrug().getDrugName();
            if (drugsMap.get(drugName)!=null) {
                drugsMap.put(drugName, drugsMap.get(drugName) + 1);

            }else {
                drugsMap.put(drugName, 1);
            }
        }
        return drugsMap;
   }


}
