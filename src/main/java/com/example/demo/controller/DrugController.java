package com.example.demo.controller;

import com.example.demo.entity.Drug;
import com.example.demo.entity.Hospital;
import com.example.demo.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/drug")
public class DrugController {
    @Autowired
    DrugService drugService;


    @GetMapping("findAllDrug")
    public List<Drug> getAllDrugs() {
        return drugService.findAllDrugs();
    }

    @GetMapping("getDrug/{drugName}")
    public Drug getDrugByDrugName(@PathVariable String drugName) {
        return drugService.getByDrugName(drugName);
    }

    @PostMapping("saveDrug")
    public void saveDrugDatabase(@RequestBody Drug drug) {
        drugService.saveDrug(drug);
    }
    @GetMapping(value="/deleteDrug/{id}")
    public void deleteDrug(@PathVariable Integer id){
        drugService.deleteDrug(id);
    }
    @PostMapping(value="/updateDrug")
    public void updateDrug(@RequestBody Drug drug){
        drugService.updateDrug(drug,drug.getIdDrug());
    }

}
