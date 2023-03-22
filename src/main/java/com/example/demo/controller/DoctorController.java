package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Drug;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;


    @GetMapping("getDoctor/{firstName}")
    public Doctor getDoctorByName(@PathVariable String firstName) {
        return doctorService.getByFirstName(firstName);
    }
    @GetMapping("getDoctorById/{id}")
    public Doctor getDoctorById(@PathVariable Integer id) {
        return doctorService.getDoctorById(id);
    }
    @PostMapping("saveDoctor")
    public void saveDoctor(@RequestBody  Doctor doctor) {doctorService.saveDoctor(doctor);}
    @GetMapping("findAllDoctor")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctor();
    }

    @GetMapping("getDoctorByAccount/{email}")
    public Doctor  getDoctorByAccount(@PathVariable String email) {
        return doctorService.getDoctorByAccount(email);
    }
    @PostMapping (value = "/updateDoctor")
    public void updateDoctor(@RequestBody Doctor doctor){
        doctorService.updateDoctor(doctor,doctor.getIdDoctor());
    }

}
