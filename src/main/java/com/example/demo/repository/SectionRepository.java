package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> {
    public Section getByName(String name);
    public List<Section> getByHospital(Hospital hospital);
    public Section findByIdSection(Integer id);



}
