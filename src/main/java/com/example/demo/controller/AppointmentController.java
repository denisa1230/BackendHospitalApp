package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;


    @GetMapping("getByPatient")
    public List<Appointment> getAppointementByPatient(@RequestBody Patient patient){
        return  appointmentService.getByPatient(patient);
    }
    @GetMapping("getByDoctor")
    public List<Appointment> getAppointementByDoctor(@RequestBody Doctor doctor){
        return  appointmentService.getByDoctor(doctor);
    }
    @PostMapping("saveAppointment")
    public void saveAppointment(@RequestBody Appointment appointment)
    {
        appointmentService.saveAppointment(appointment);
    }
}
