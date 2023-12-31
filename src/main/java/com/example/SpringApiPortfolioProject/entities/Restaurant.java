package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String street;
    private String state;
    private String zipCode;

    private Integer overallScore;
    private Integer peanutScore;
    private Integer diaryScore;
    private Integer eggScore;
}
