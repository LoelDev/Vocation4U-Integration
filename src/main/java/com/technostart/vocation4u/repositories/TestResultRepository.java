package com.technostart.vocation4u.repositories;

import com.technostart.vocation4u.models.TestResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TestResultRepository extends CrudRepository<TestResult, Long> {

    public abstract ArrayList<TestResult> findByStudentId(Integer studentId);
}
