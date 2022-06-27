package com.technostart.vocation4u.controllers;

import com.technostart.vocation4u.models.TestModel;
import com.technostart.vocation4u.services.TestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/testModels")
public class TestModelController {

    @Autowired
    TestModelService testModelService;

    @GetMapping()
    public ArrayList<TestModel> getTestModels(){
        return testModelService.getTestModels();
    }

    @GetMapping(path ="/{id}")
    public Optional<TestModel> getTestModelsById(@PathVariable("id") Long id){
        return this.testModelService.getById(id);
    }

    @PostMapping()
    public TestModel postTestModel(@RequestBody TestModel testModel){
        return this.testModelService.postTestModel(testModel);
    }
}
