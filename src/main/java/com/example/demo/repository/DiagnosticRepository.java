package com.example.demo.repository;

import com.example.demo.entity.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosticRepository extends JpaRepository<Diagnostic, Integer> {
    public Diagnostic findByDetails(String details);
    public List<Diagnostic> findAll();
    public Diagnostic findByIdDiagnostic(Integer id);
}

