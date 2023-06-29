package com.example.demo.controller;

import com.example.demo.dto.DoctorAccountDto;
import com.example.demo.dto.PatientAccountDto;
import com.example.demo.entity.Account;
import com.example.demo.entity.Doctor;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/account")

public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("createDoctorAccount")
    public Account createDoctorAccount(@RequestBody DoctorAccountDto doctorAccountDto) {
        return accountService.saveDoctorAccount(doctorAccountDto);
    }
    @PostMapping("createPatientAccount")
    public Account createPatientAccount(@RequestBody PatientAccountDto patientAccountDto) {
        return accountService.savePatientAccount(patientAccountDto);
    }
    @GetMapping("getAccountByEmail/{email}")
    public Account getAccount (@PathVariable String email){
        return accountService.getAccountByEmail(email);
    }
    @PostMapping("saveDoctor")
    public Account saveDoctorAccount(DoctorAccountDto doctorAccountDto){
        return accountService.saveDoctorAccount(doctorAccountDto);
    }
    @PostMapping (value = "/updateAccount")
    public void updateAccount(@RequestBody Account account){
        accountService.updateAccount(account, account.getIdAccount());
    }



}
