package com.technostart.vocation4u.repositories;

import com.technostart.vocation4u.models.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

    public abstract ArrayList<Appointment> findByStudentId(Integer studentId);
}
