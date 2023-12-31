package com.example.SpringApiPortfolioProject.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String state;
    private String zipcode;
    private Boolean peanutAllergy;
    private Boolean eggAllergy;
    private Boolean diaryAllergy;

}
