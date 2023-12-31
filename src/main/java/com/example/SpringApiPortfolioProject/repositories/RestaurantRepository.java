package com.example.SpringApiPortfolioProject.repositories;

import com.example.SpringApiPortfolioProject.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
    Optional<Restaurant> findRestaurantsByNameAndZipCode(String name, String zipCode);
    List<Restaurant> findRestaurantsByZipCodeAndPeanutScoreNotNullOrderByPeanutScore(String zipCode);

    List<Restaurant> findRestaurantsByZipCodeAndDiaryScoreNotNullOrderByDiaryScore(String zipCode);
    List<Restaurant> findRestaurantsByZipCodeAndEggScoreNotNullOrderByEggScore(String zipCode);

}
