package com.technostart.vocation4u.models;

import javax.persistence.*;

@Entity
@Table(name = "dates")
public class Date {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Integer specialistId;
    private String date;
    private String hourBegin;
    private String hourEnd;
    private String available;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSpecialistId (Integer specialistId){
        this.specialistId = specialistId;
    }

    public Integer getSpecialistId(){
        return specialistId;
    }

    public void setDate (String date){ this.date = date; }

    public String getDate(){
        return date;
    }

    public void setHourBegin (String hourBegin){ this.hourBegin = hourBegin; }

    public String getHourBegin(){
        return hourBegin;
    }

    public void setHourEnd (String hourEnd){ this.hourEnd = hourEnd; }

    public String getHourEnd(){
        return hourEnd;
    }

    public void setAvailable (String available){ this.available = available; }

    public String getAvailable(){
        return available;
    }
}
