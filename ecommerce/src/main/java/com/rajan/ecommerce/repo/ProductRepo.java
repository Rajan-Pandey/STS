package com.rajan.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.ecommerce.models.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
