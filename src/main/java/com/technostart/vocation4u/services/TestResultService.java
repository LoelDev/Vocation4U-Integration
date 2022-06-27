package com.technostart.vocation4u.services;


import com.technostart.vocation4u.models.TestResult;
import com.technostart.vocation4u.repositories.TestResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TestResultService {

    @Autowired
    TestResultRepository testResultRepository;

    public ArrayList<TestResult> getTestResults(){
        return (ArrayList<TestResult>) testResultRepository.findAll();
    }

    public TestResult postTestResults (TestResult testResult){
        return testResultRepository.save(testResult);
    }

    public Optional<TestResult> getById(Long id){
        return testResultRepository.findById(id);
    }

    public ArrayList<TestResult> getByStudentId(Integer studentId){
        return testResultRepository.findByStudentId(studentId);
    }
}
