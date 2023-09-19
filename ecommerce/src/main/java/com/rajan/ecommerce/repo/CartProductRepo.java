package com.rajan.ecommerce.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.ecommerce.models.CartProduct;

public interface CartProductRepo  extends JpaRepository<CartProduct,Integer>{
}
