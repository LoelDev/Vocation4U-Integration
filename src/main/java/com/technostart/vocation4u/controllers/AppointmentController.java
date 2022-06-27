package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.Appointment;
import com.technostart.vocation4u.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping()
    public ArrayList<Appointment> getAppintments(){
        return appointmentService.getAppointments();
    }

    @GetMapping(path ="/{id}")
    public Optional<Appointment> getById(@PathVariable("id") Long id){
        return this.appointmentService.getById(id);
    }

    @PostMapping()
    public Appointment postAppointment(@RequestBody Appointment appointment){
        return this.appointmentService.postAppointments(appointment);
    }

    @GetMapping("/query")
    public ArrayList<Appointment> getByStudentId (@RequestParam("studentId") Integer studentId){
        return this.appointmentService.getByStudentId(studentId);
    }
}
