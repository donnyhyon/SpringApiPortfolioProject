package com.example.SpringApiPortfolioProject.repositories;

import com.example.SpringApiPortfolioProject.entities.Review;
import com.example.SpringApiPortfolioProject.entities.ReviewStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository {
    List<Review> findReviewsByStatus(ReviewStatus status);
    List<Review> findReviewsByRestaurantIdAndStatus(Long restaurantId, ReviewStatus status);


}
