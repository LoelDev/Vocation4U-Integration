package com.technostart.vocation4u.models;

import javax.persistence.*;

@Entity
@Table(name = "test_models")
public class TestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String title;
    private String description;
    private String imageUrl;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDescription (String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setImageUrl (String imageUrl){
        this.imageUrl = imageUrl;
    }

    public String getImageUrl(){
        return imageUrl;
    }
}
