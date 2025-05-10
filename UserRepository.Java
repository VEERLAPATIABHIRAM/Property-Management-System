package com.klu.PropertyMS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods here if needed
    // For example:
    // User findByEmail(String email);
}
