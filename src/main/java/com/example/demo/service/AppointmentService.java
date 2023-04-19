package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    public void saveAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }


    public List<Appointment> getAppointmentByDoctorId(Integer id) {
        Doctor doctor = doctorRepository.findByIdDoctor(id);
        if (doctor == null) {
            // aruncă o excepție sau întoarce un răspuns de eroare
            throw new RuntimeException("Doctor not found");
        }
        return appointmentRepository.findByDoctor(doctor);
    }
    public List<Appointment> getAppointmentByPatient(Integer id) {
         Patient patient=patientRepository.findByIdPatient(id);
        if (patient == null) {
            // aruncă o excepție sau întoarce un răspuns de eroare
            throw new RuntimeException("Patient not found");
        }
        return appointmentRepository.findByPatient(patient);
    }
    public Appointment updateAppointment(Appointment appointment, Integer id)
    {
        Appointment appointment1=appointmentRepository.findByIdAppointment(id);
        appointment1.setHour(appointment.getHour());
        appointment1.setDate(appointment.getDate());
        appointment1.setStatus(appointment.getStatus());
        return appointmentRepository.save(appointment1);
    }
    public List<Appointment> getAllAppoitement(){
        return appointmentRepository.findAll();
    }

    public void  deleteAppointment(Integer id){
        List<Appointment> appointments=appointmentRepository.findAll();
        for (Appointment a: appointments){
            if(a.getIdAppointment()==id)
            {
                appointmentRepository.delete(a);
            }
        }
    }
    public Appointment findAppointmentById (Integer id){
        return appointmentRepository.findByIdAppointment(id);
    }
}
