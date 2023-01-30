package com.example.demo.repository;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
public List<Appointment> getByDoctor(Doctor doctor);
    public List<Appointment> getByPatient(Patient patient);

}
