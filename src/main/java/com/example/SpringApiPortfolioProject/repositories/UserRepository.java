package com.example.SpringApiPortfolioProject.repositories;

import com.example.SpringApiPortfolioProject.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByDisplayName(String displayName);

}
