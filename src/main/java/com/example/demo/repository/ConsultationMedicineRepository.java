package com.example.demo.repository;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Consultation;
import com.example.demo.entity.ConsultationMedicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationMedicineRepository extends JpaRepository<ConsultationMedicine, Integer> {

public List<ConsultationMedicine> findByConsultation(Consultation consultation);


}
