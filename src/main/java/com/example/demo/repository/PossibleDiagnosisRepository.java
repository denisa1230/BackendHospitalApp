package com.example.demo.repository;

import com.example.demo.entity.PossibleDiagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PossibleDiagnosisRepository extends JpaRepository<PossibleDiagnosis, Integer> {
    public PossibleDiagnosis findByDetails(String details);
}

