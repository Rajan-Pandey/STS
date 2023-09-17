package com.rajan.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.ecommerce.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
