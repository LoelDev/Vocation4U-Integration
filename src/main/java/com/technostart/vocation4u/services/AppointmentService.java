package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.Appointment;
import com.technostart.vocation4u.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public ArrayList<Appointment> getAppointments(){
        return (ArrayList<Appointment>) appointmentRepository.findAll();
    }

    public Appointment postAppointments (Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public Optional<Appointment> getById(Long id){
        return appointmentRepository.findById(id);
    }

    public ArrayList<Appointment> getByStudentId(Integer studentId){
        return appointmentRepository.findByStudentId(studentId);
    }
}
