package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.Specialist;
import com.technostart.vocation4u.services.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/specialist")
public class SpecialistController {
    @Autowired
    SpecialistService specialistService;

    @GetMapping()
    public ArrayList<Specialist> getSpecialists(){
        return specialistService.getSpecialists();
    }

    @GetMapping(path ="/{id}")
    public Optional<Specialist> getSpecialistById(@PathVariable("id") Long id){
        return this.specialistService.getById(id);
    }

    @PostMapping()
    public Specialist postSpecialist(@RequestBody Specialist specialist){
        return this.specialistService.postSpecialist(specialist);
    }
}
