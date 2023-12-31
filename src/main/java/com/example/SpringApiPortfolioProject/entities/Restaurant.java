package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
