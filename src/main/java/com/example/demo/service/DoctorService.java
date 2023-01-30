package com.example.demo.service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Section;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private SectionRepository sectionRepository;

   public Doctor saveDoctor(Doctor doctor)
   {
       Section section= sectionRepository.getByName(doctor.getSection().getName());
       doctor.setSection(section);
       return doctorRepository.save(doctor);
   }
    public List<Doctor> getSection(Section section) {
        return doctorRepository.getBySection(section);
    }
    public Doctor getByFirstName(String fristName){
        return doctorRepository.getByFirstName(fristName);
    }
}
