package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    public Patient getByFirstName(String firstName);
    public List<Patient> findAll();
    public Patient findByAccount(Account Account);
    public Patient findByIdPatient(Integer id);
}

