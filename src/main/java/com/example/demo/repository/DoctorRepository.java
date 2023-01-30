package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    public Doctor getByFirstName(String firstName);
    public List<Doctor> getBySection(Section section);
}
