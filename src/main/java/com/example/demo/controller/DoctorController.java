package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Drug;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("saveDoctor")
    public void saveDoctor(@RequestBody  Doctor doctor) {doctorService.saveDoctor(doctor);}


}
