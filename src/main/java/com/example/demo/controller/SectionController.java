package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import com.example.demo.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/section")
public class SectionController {

    @Autowired
    SectionService sectionService;

    @PostMapping("saveSection")
    public Section saveSection(@RequestBody Section section) {
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
    @GetMapping("findAllSections")
    public List<Section> getAllSection() {

        return sectionService.getAllSection();
    }
    @GetMapping(value="/deleteSection/{id}")
    public void deleteSection(@PathVariable Integer id){
        sectionService.deleteSection(id);
    }
    @PostMapping(value="/updateSection")
    public void updateSection(@RequestBody Section section){
        sectionService.updateSection(section,section.getIdSection());
    }


}
