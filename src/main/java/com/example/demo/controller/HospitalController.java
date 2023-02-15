package com.example.demo.controller;

import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import com.example.demo.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("findAllHospital")
    public List<Hospital> getAllHospitalByName() {

        return hospitalService.findAllHospital();
    }

    @GetMapping("getHospital/{name}")
    public Hospital getHospitalByName(@PathVariable String name){
        return hospitalService.getByName(name);
    }
    @PostMapping("saveHospital")
    public void SaveHospitalInDatabase(@RequestBody Hospital hospital)
    {
        hospitalService.saveHospital(hospital);
    }

    @GetMapping("getAllSectionByHospital/{name}")
    public List<Section> getSectionsByHospital(@PathVariable String name){
        return hospitalService.getSectionsByHospital(name);
    }

}
