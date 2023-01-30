package com.example.demo.service;

import com.example.demo.entity.Drug;
import com.example.demo.entity.Section;
import com.example.demo.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {
    @Autowired
    private DrugRepository drugRepository;

    public void saveDrug(Drug drug) {
        drugRepository.save(drug);
    }

    public Drug getByDrugName(String drugName) {
        return drugRepository.findByDrugName(drugName);
    }
    public List<Drug> findAllDrugs() {
        return drugRepository.findAll();
    }



}

