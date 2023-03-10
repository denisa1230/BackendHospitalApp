package com.example.demo.service;

import com.example.demo.dto.DoctorAccountDto;
import com.example.demo.dto.PatientAccountDto;
import com.example.demo.entity.Account;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    public Account getAccountByEmail(String email) {
        return accountRepository.getByEmail(email);
    }

    public Account saveDoctorAccount(DoctorAccountDto doctorAccount) {
        Account account = accountRepository.save(new Account(doctorAccount.getEmail(), doctorAccount.getPassword(),"doctor"));
        Doctor doctor = doctorAccount.getDoctor();
        doctor.setAccount(account);
        doctorService.saveDoctor(doctor);
        return account;
    }
    public Account savePatientAccount(PatientAccountDto patientAccountDto) {
        Account account = accountRepository.save(new Account(patientAccountDto.getEmail(), patientAccountDto.getPassword(),"pacient"));
        Patient patient = patientAccountDto.getPatient();
        patient.setAccount(account);
        patientService.savePatient(patient);
        return account;
    }

}
