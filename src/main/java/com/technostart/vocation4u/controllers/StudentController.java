package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.Student;
import com.technostart.vocation4u.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping()
    public ArrayList<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping(path ="/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id){
        return this.studentService.getById(id);
    }

    @PostMapping()
    public Student postStudent(@RequestBody Student student){
        return this.studentService.postStudent(student);
    }


}
