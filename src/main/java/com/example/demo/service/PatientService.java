package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientReposiroty;

    @Autowired
    private AccountRepository accountRepository;

    public Patient getByFirstName(String firstName) {

        return patientReposiroty.getByFirstName(firstName);
    }

    public List<Patient> getAllPatient() {
        return patientReposiroty.findAll();
    }

    public Patient savePatient(Patient patient) {
        Account account = accountRepository.findByEmail(patient.getAccount().getEmail());
        patient.setAccount(account);
        return patientReposiroty.save(patient);
    }

    public Patient getPatientByAccount(String email)
    {
        Account account=accountRepository.findByEmail(email);
        return patientReposiroty.findByAccount(account);
    }
    public Patient updatePatient (Patient patient, Integer id){
        Patient patient1=patientReposiroty.findByIdPatient(id);
        patient1.setFirstName(patient.getFirstName());
        patient1.setLastName(patient.getLastName());
        patient1.setGender(patient.getGender());
        patient1.setBirth(patient.getBirth());
        patient1.setPhone(patient.getPhone());
        patient1.setAddress(patient.getAddress());
        patient1.setEmail(patient.getEmail());
        return patientReposiroty.save(patient1);
    }
}
