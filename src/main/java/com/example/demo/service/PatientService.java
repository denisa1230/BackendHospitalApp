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
        Account account = accountRepository.getByEmail(patient.getAccount().getEmail());
        patient.setAccount(account);
        return patientReposiroty.save(patient);
    }
}
