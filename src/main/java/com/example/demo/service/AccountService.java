package com.example.demo.service;


import com.example.demo.dto.DoctorAccountDto;
import com.example.demo.dto.PatientAccountDto;
import com.example.demo.entity.Account;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public Account getAccountByEmail(String email) {
        return accountRepository.findByEmail(email);
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

    public Account updateAccount (Account account, Integer id){
        Account account1=accountRepository.findByIdAccount(id);
        account1.setIdAccount(account.getIdAccount());
        account1.setEmail(account.getEmail());
        account1.setPassword(account.getPassword());
        account1.setType(account.getType());
        return accountRepository.save(account1);
    }

}
