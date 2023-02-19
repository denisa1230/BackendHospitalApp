package com.example.demo.service;

import com.example.demo.entity.Drug;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import com.example.demo.repository.HospitalRepository;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private SectionService sectionService;

    public void saveHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

    public Hospital getByName(String name) {
        return hospitalRepository.findByName(name);
    }
    public Hospital findIdHospital(Integer id) {
        return hospitalRepository.findByIdHospital(id);
    }

    public List<Hospital> findAllHospital() {
        return hospitalRepository.findAll();
    }
    public void deleteHospital( Integer id) {
        List<Hospital> hospital = hospitalRepository.findAll();
        for (Hospital s : hospital) {
            if (s.getIdHospital() == id) {
                hospitalRepository.delete(s);

            }
        }
    }


        public List<Section> getSectionsByHospital(String name) {

            Hospital hospital = hospitalRepository.findByName(name);

            return sectionService.getHospital(hospital);

        }

    public Hospital updateHospital (Hospital hospital, Integer id) {
        Hospital hospital1= hospitalRepository.findByIdHospital(id);
        hospital1.setIdHospital(hospital.getIdHospital());
        hospital1.setName(hospital.getName());
        hospital1.setAddress(hospital.getAddress());
        hospital1.setLocality(hospital.getLocality());
        hospital1.setCounty(hospital.getCounty());
        hospital1.setCountry(hospital.getCountry());
        return hospitalRepository.save(hospital1);
    }


}
