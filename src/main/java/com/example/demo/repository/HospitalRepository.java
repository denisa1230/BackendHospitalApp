package com.example.demo.repository;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

    public List<Hospital> findAll();
    public Hospital findByName(String name);

    public Hospital findByIdHospital(Integer hospitalId);


}
