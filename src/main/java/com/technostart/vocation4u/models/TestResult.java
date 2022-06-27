package com.technostart.vocation4u.models;

import javax.persistence.*;

@Entity
@Table(name = "test_results")
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Integer studentId;
    private Integer testModelId;
    private String results;

    public void setId(Long id) { this.id = id; }

    public Long getId() {
        return id;
    }

    public void setStudentId (Integer studentId){
        this.studentId = studentId;
    }

    public Integer getStudentId(){
        return studentId;
    }

    public void setTestModelId (Integer testModelId){
        this.testModelId = testModelId;
    }

    public Integer getTestModelId(){
        return testModelId;
    }

    public void setResults (String results){
        this.results = results;
    }

    public String getResults(){
        return results;
    }
}
