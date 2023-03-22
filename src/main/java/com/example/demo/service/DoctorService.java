package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Section;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private SectionRepository sectionRepository;

    public Doctor saveDoctor(Doctor doctor) {
        Section section = sectionRepository.getByName(doctor.getSection().getName());
        doctor.setSection(section);
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getSection(Section section) {
        return doctorRepository.getBySection(section);
    }

    public Doctor getByFirstName(String fristName) {
        return doctorRepository.getByFirstName(fristName);
    }

    public Doctor getDoctorById(Integer id) {
        return doctorRepository.findByIdDoctor(id);
    }

    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorByAccount(String email) {
        Account account= accountRepository.findByEmail(email);
        return doctorRepository.findByAccount(account);
    }
    public Doctor updateDoctor(Doctor doctor, Integer id)
    {
        Doctor doctor1=doctorRepository.findByIdDoctor(id);
        doctor1.setSection(doctor.getSection());
        doctor1.setFirstName(doctor.getFirstName());
        doctor1.setLastName(doctor.getLastName());
       doctor1.setDescription(doctor.getDescription());
       doctor1.setEmail(doctor.getEmail());
       doctor1.setPhone(doctor.getPhone());
       doctor1.setProgram(doctor.getProgram());
       doctor1.setSpecialization(doctor.getSpecialization());
       return doctorRepository.save(doctor1);
    }
}
