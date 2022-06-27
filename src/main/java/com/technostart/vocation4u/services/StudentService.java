package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.Student;
import com.technostart.vocation4u.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public ArrayList<Student> getStudents (){
        return (ArrayList<Student>) studentRepository.findAll();
    }

    public Student postStudent (Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> getById(Long id){
        return studentRepository.findById(id);
    }
}
