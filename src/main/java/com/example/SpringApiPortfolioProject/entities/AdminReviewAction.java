package com.example.SpringApiPortfolioProject.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AdminReviewAction {
    private Boolean reviewAccepted;
}
