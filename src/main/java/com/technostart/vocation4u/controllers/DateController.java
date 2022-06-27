package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.Date;
import com.technostart.vocation4u.services.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/date")
public class DateController {

    @Autowired
    DateService dateService;

    @GetMapping()
    public ArrayList<Date> getDates(){
        return dateService.getDates();
    }

    @GetMapping(path ="/{id}")
    public Optional<Date> getById(@PathVariable("id") Long id){
        return this.dateService.getById(id);
    }

    /*@GetMapping("/query")
    public ArrayList<Date> getBySpecialistId (@RequestParam("specialistId") Integer specialistId){
        return this.dateService.getBySpecialistId(specialistId);
    }*/

    @PostMapping()
    public Date postDate(@RequestBody Date date){
        return this.dateService.postDate(date);
    }

    @GetMapping("/query")
    public ArrayList<Date> getByAvailable (@RequestParam("available") String available){
        return this.dateService.getByAvailable(available);
    }
}
