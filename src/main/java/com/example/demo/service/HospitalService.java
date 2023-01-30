package com.example.demo.service;

import com.example.demo.entity.Drug;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import com.example.demo.repository.HospitalRepository;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private SectionService sectionService;

    public void saveHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

    public Hospital getByName(String name) {
        return hospitalRepository.findByName(name);
    }

    public List<Hospital> findAllHospital() {
        return hospitalRepository.findAll();
    }

    public List<Section> getSectionsByHospital(String name) {

        Hospital hospital = hospitalRepository.findByName(name);

        return sectionService.getHospital(hospital);
    }
}
