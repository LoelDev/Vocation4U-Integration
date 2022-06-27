package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.TestResult;
import com.technostart.vocation4u.services.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/testResults")
public class TestResultController {

    @Autowired
    TestResultService testResultService;

    @GetMapping()
    public ArrayList<TestResult> getTestResults(){
        return testResultService.getTestResults();
    }

    @GetMapping(path ="/{id}")
    public Optional<TestResult> getById(@PathVariable("id") Long id){
        return this.testResultService.getById(id);
    }

    @PostMapping()
    public TestResult postTestResults(@RequestBody TestResult testResult){
        return this.testResultService.postTestResults(testResult);
    }

    @GetMapping("/query")
    public ArrayList<TestResult> getByStudentId (@RequestParam("studentId") Integer studentId){
        return this.testResultService.getByStudentId(studentId);
    }
}
