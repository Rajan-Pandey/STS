package com.rajan.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rajan.ecommerce.models.Cart;
import com.rajan.ecommerce.repo.CartRepo;

@RestController
public class ECommerceController {
	
	@Autowired
	CartRepo cartRepo;
	
	@GetMapping("/cart/{id}")
	public Cart getCart(@PathVariable("id") int id)
	{
		return cartRepo.findById(id).get();
	}

}
