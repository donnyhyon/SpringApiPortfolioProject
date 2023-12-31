package com.example.SpringApiPortfolioProject.repositories;

import com.example.SpringApiPortfolioProject.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
