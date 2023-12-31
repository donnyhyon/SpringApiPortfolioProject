package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue
    private Long id;


    private String submittedBy;
    private Long restaurantId;
    private String commentary;
    private Integer peanutScore;
    private Integer eggScore;
    private Integer diaryScore;

}
