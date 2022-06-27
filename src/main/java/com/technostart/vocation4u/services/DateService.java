package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.Date;
import com.technostart.vocation4u.repositories.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DateService {

    @Autowired
    DateRepository dateRepository;

    public ArrayList<Date> getDates(){
        return (ArrayList<Date>) dateRepository.findAll();
    }

    public Date postDate (Date date){
        return dateRepository.save(date);
    }

    public Optional<Date> getById(Long id){
        return dateRepository.findById(id);
    }

    /*public ArrayList<Date> getBySpecialistId(Integer specialistId){
        return dateRepository.findBySpecialistId(specialistId);
    }*/

    public ArrayList<Date> getByAvailable(String available){
        return dateRepository.findByAvailable(available);
    }
}
