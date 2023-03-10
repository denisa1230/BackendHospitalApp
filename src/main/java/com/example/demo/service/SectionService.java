package com.example.demo.service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.HospitalRepository;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private DoctorService doctorService;

    public Section saveSection(Section section) {
        return sectionRepository.save(section);

    }

    public List<Section> getAllSection() {
        return sectionRepository.findAll();
    }

    public List<Section> getHospital(Hospital hospital) {
        return sectionRepository.getByHospital(hospital);
    }

    public List<Doctor> getDoctorBySection(String name) {

        Section section = sectionRepository.getByName(name);

        return doctorService.getSection(section);
    }

    public Section getSectionByName(String name) {
        return sectionRepository.getByName(name);

    }
}
