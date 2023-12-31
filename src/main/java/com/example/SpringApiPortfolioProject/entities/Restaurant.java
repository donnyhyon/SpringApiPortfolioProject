package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="\"RESTAURANT\"")
@Getter
@Setter
@RequiredArgsConstructor
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
