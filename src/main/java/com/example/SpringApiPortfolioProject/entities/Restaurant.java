package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue
    private Long restaurantId;

    private String name;
    private String street;
    private String state;
    private String zipCode;

    private Integer overallScore;
    private Integer peanutScore;
    private Integer diaryScore;
    private Integer eggScore;
}
