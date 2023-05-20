package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping("getByPatient/{id}")
    public List<Appointment> getAppointmentByPatient(@PathVariable Integer id){
        return  appointmentService.getAppointmentByPatient(id);
    }
    @GetMapping("getAppointmentById/{id}")
    public Appointment getAppointmentById(@PathVariable Integer id){
        return appointmentService.findAppointmentById(id);
    }

    @GetMapping("/getAppointmentByDoctor/{id}")
    public List<Appointment> getAppointmentByDoctor(@PathVariable Integer id) {
        return appointmentService.getAppointmentByDoctorId(id);

    }
    @PostMapping("/saveAppointment")
    public void saveAppointment(@RequestBody Appointment appointment)
    {
        appointmentService.saveAppointment(appointment);
    }
    @GetMapping("findAllAppointments")
    public  List<Appointment> findAllAppointments()
    {
        return appointmentService.getAllAppoitement();
    }
    @GetMapping("findAllAppointmentsByMonth")
    public  List<Appointment> findAllAppointmentsByMonth(Integer month)
    {
        return appointmentService.getAppointmentBYMonth(month);
    }

    @PostMapping(value="/updateAppointment")
    public void updateAppointment(@RequestBody Appointment appointment)
    {
        appointmentService.updateAppointment(appointment, appointment.getIdAppointment());
    }
    @GetMapping(value="/deleteAppointment/{id}")
    public void deleteAppointment(@PathVariable Integer id){
        appointmentService.deleteAppointment(id);
    }

}
