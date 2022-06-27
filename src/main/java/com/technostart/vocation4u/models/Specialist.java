package com.technostart.vocation4u.models;

import javax.persistence.*;

@Entity
@Table(name = "specialists")
public class Specialist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String address;
    private Long phone_number;
    private String email;
    private String password;
    private Long regular_price;

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhoneNumber (Long phone_number){
        this.phone_number = phone_number;
    }

    public Long getPhoneNumber(){
        return phone_number;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPrice (Long regular_price){
        this.regular_price = regular_price;
    }

    public Long getPrice() {
        return regular_price;
    }
}
