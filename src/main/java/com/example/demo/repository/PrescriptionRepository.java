package com.example.demo.repository;

import com.example.demo.entity.Patient;
import com.example.demo.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    public List<Prescription> getPrescriptionByPatient (Patient patient);
}
