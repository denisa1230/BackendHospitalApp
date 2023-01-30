package com.example.demo.repository;

import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiagnosticRepository extends JpaRepository<Diagnostic, Integer>{

    public List<Diagnostic> getDiagnosticByAppointment(Appointment appointment);


}
