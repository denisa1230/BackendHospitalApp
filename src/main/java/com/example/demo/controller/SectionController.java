package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Section;
import com.example.demo.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SectionController {

    @Autowired
    SectionService sectionService;

    @PostMapping("saveSection")
    public Section save(@RequestBody Section section) {
        return sectionService.saveSection(section);
    }

    @GetMapping("getSection/{name}")
    public Section getSectionByName(@PathVariable String name) {
        return sectionService.getSectionByName(name);
    }
    @GetMapping ("getDoctorBySection/{name}")
    public List<Doctor> getDoctorsBySection(@PathVariable String name){
        return sectionService.getDoctorBySection(name);
    }


}
