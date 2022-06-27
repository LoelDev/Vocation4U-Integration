package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.Specialist;
import com.technostart.vocation4u.repositories.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SpecialistService {

    @Autowired
    SpecialistRepository specialistRepository;

    public ArrayList<Specialist> getSpecialists (){
        return (ArrayList<Specialist>) specialistRepository.findAll();
    }

    public Specialist postSpecialist (Specialist specialist){
        return specialistRepository.save(specialist);
    }

    public Optional<Specialist> getById(Long id){
        return specialistRepository.findById(id);
    }
}
