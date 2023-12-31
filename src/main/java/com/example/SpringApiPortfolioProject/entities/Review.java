package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="\"REVIEW\"")
@Getter
@Setter
@RequiredArgsConstructor
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

    private ReviewStatus status;

}
