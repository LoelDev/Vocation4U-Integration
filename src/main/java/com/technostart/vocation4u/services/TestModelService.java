package com.technostart.vocation4u.services;

import com.technostart.vocation4u.models.TestModel;
import com.technostart.vocation4u.repositories.TestModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TestModelService {

    @Autowired
    TestModelRepository testModelRepository;

    public ArrayList<TestModel> getTestModels (){
        return (ArrayList<TestModel>) testModelRepository.findAll();
    }

    public TestModel postTestModel (TestModel testModel){
        return testModelRepository.save(testModel);
    }

    public Optional<TestModel> getById(Long id){
        return testModelRepository.findById(id);
    }
}
