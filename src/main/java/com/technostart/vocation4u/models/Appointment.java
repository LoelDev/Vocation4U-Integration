package com.technostart.vocation4u.models;

import javax.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Integer studentId;
    private Integer specialistId;
    private Integer dateId;
    private Long price;
    private String comission;
    private String state;

    public void setId(Long id) { this.id = id; }

    public Long getId() {
        return id;
    }

    public void setSpecialistId (Integer specialistId){
        this.specialistId = specialistId;
    }

    public Integer getSpecialistId(){
        return specialistId;
    }

    public void setStudentId (Integer studentId){
        this.studentId = studentId;
    }

    public Integer getStudentId(){
        return studentId;
    }

    public void setDateId (Integer dateId){
        this.dateId = dateId;
    }

    public Integer getDateId(){
        return dateId;
    }

    public void setPrice (Long price){
        this.price = price;
    }

    public Long getPrice(){
        return price;
    }

    public void setComission (String comission){
        this.comission = comission;
    }

    public String getComission(){
        return comission;
    }

    public void setState (String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
