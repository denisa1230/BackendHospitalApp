package com.example.demo.controller;

import com.example.demo.dto.ConsultationDto;
import com.example.demo.entity.Consultation;
import com.example.demo.entity.ConsultationMedicine;
import com.example.demo.entity.Drug;
import com.example.demo.service.ConsultationMedicineService;
import com.example.demo.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/consultationMedicine")
public class ConsultationMedicineController {
    @Autowired
    ConsultationMedicineService consultationMedicineService;

    @PostMapping("saveConsultationMedicine")
    public void saveConsultation(@RequestBody ConsultationDto consultationDto) {
        consultationMedicineService.saveConsultation(consultationDto.getConsultation(), consultationDto.getDrugs());
    }

    @PostMapping("getDrugConsultation")
    public List<String> getDrugByConsultation(@RequestBody Consultation consultation) {
        return consultationMedicineService.getDrugs(consultation);
    }
    @GetMapping("findNumberOfDrugs")
    public HashMap<String, Integer> findNumberOfDrugs() {
        return  consultationMedicineService.getAllDrugs();
    }
}
