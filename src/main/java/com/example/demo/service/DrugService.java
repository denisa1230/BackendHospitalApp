package com.example.demo.service;

import com.example.demo.entity.Drug;
import com.example.demo.entity.Hospital;
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

    public void deleteDrug( Integer id) {
        List<Drug> drug = drugRepository.findAll();
        for (Drug s : drug) {
            if (s.getIdDrug() == id) {
                drugRepository.delete(s);

            }
        }
    }
    public Drug updateDrug (Drug drug, Integer id) {
        Drug drug1= drugRepository.findByIdDrug(id);
        drug1.setIdDrug(drug.getIdDrug());
        drug1.setDrugName(drug.getDrugName());
        drug1.setDosage(drug.getDosage());
        drug1.setStatus(drug.getStatus());
        return drugRepository.save(drug1);
    }


}

