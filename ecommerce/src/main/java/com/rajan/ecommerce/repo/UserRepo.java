package com.rajan.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.ecommerce.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
