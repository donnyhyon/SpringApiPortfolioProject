package com.example.SpringApiPortfolioProject.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="\"USER\"")
@Getter
@Setter
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long userId;

    private String displayName;
    private String city;
    private String state;
    private String zipcode;
    private Boolean peanutAllergy;
    private Boolean eggAllergy;
    private Boolean diaryAllergy;

}
