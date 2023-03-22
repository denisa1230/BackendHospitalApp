package com.example.demo.repository;

import com.example.demo.entity.Drug;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {
    public Drug findByDrugName(String drugName);

    public Drug findByIdDrug (Integer id);

}