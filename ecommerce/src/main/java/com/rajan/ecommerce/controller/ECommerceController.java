package com.rajan.ecommerce.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rajan.ecommerce.models.Cart;
import com.rajan.ecommerce.models.CartProduct;
import com.rajan.ecommerce.models.Category;
import com.rajan.ecommerce.models.Product;
import com.rajan.ecommerce.models.Role;
import com.rajan.ecommerce.models.User;
import com.rajan.ecommerce.repo.CartProductRepo;
import com.rajan.ecommerce.repo.CartRepo;
import com.rajan.ecommerce.repo.CategoryRepo;
import com.rajan.ecommerce.repo.ProductRepo;
import com.rajan.ecommerce.repo.UserRepo;

@RestController
public class ECommerceController {
	
	@Autowired
	CartRepo cartRepo;
	@Autowired
	CategoryRepo categoryRepo;
	@Autowired
	ProductRepo productRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	CartProductRepo cpRepo;
	
	@GetMapping("/cart/")
	public List<Cart> getCart()
	{
		return cartRepo.findAll();
	}
	
	@GetMapping("/category/")
	public List<Category> getCategory()
	{
		return categoryRepo.findAll();
	}
	
	@GetMapping("/product/")
	public List<Product> getProduct()
	{
		return productRepo.findAll();
	}
	
	@GetMapping("/user/")
	public List<User> getUser()
	{
		return userRepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Set<Role> getUser(@PathVariable("id") int id)
	{
		User u = userRepo.findById(id).get();
		return u.getRoles();
	}
	
	@GetMapping("/cartproduct/")
	public List<CartProduct> getCartProduct()
	{
		return cpRepo.findAll();
	}

}
