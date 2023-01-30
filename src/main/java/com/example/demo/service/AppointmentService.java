package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    public Appointment saveAppointment(Appointment appointment)
    {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getByDoctor(Doctor doctor){
        return appointmentRepository.getByDoctor(doctor);
    }
    public List<Appointment> getByPatient(Patient patient){
        return appointmentRepository.getByPatient(patient);
    }

}
