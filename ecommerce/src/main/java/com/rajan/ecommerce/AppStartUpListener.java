package com.rajan.ecommerce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

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
import com.rajan.ecommerce.repo.RoleRepo;
import com.rajan.ecommerce.repo.UserRepo;

@Component
public class AppStartUpListener implements ApplicationListener<ContextRefreshedEvent> {

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
	@Autowired
	RoleRepo roleRepo;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		Category category1 = new Category();
		category1.setCategoryId(1);
		category1.setCategoryName("Fashion");
		categoryRepo.save(category1);
		
		Category category2 = new Category();
		category2.setCategoryId(2);
		category2.setCategoryName("Electronics");
		categoryRepo.save(category2);
		
		Category category3 = new Category();
		category3.setCategoryId(3);
		category3.setCategoryName("Books");
		categoryRepo.save(category3);
		
		Category category4 = new Category();
		category4.setCategoryId(4);
		category4.setCategoryName("Groceries");
		categoryRepo.save(category4);
		
		Category category5 = new Category();
		category5.setCategoryId(5);
		category5.setCategoryName("Medicines");
		categoryRepo.save(category5);
		
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setRole("CONSUMER");
		roleRepo.save(role1);
		
		Role role2 = new Role();
		role2.setRoleId(2);
		role2.setRole("SELLER");
		roleRepo.save(role2);
		
		User user1 = new User();
		user1.setUserId(1);
		user1.setPassword("pass_word");
		user1.setUsername("jack");
		Set<Role> roles1 = new HashSet<>();
		roles1.add(roleRepo.findById(1).get());
		user1.setRoles(roles1);
		userRepo.save(user1);
		
		User user2 = new User();
		user2.setUserId(2);
		user2.setPassword("pass_word");
		user2.setUsername("bob");
		Set<Role> roles2 = new HashSet<>();
		roles2.add(roleRepo.findById(1).get());
		user2.setRoles(roles2);
		//user2.setRoles((Set<Role>) role1);
		userRepo.save(user2);
		
		User user3 = new User();
		user3.setUserId(3);
		user3.setPassword("pass_word");
		user3.setUsername("apple");
		Set<Role> roles3 = new HashSet<>();
		roles3.add(roleRepo.findById(2).get());
		user3.setRoles(roles3);
		//user3.setRoles((Set<Role>) role2);
		userRepo.save(user3);
		
		User user4 = new User();
		user4.setUserId(4);
		user4.setPassword("pass_word");
		user4.setUsername("glaxo");
		Set<Role> roles4 = new HashSet<>();
		roles4.add(roleRepo.findById(2).get());
		user4.setRoles(roles4);
		//user4.setRoles((Set<Role>) role2);
		userRepo.save(user4);
		
		Cart cart1 = new Cart();
		cart1.setCartId(1);
		cart1.setTotalAmount(20.0);
		cart1.setUser(userRepo.findById(1).get());
		cart1.setCartProducts(new ArrayList<CartProduct>());
		cartRepo.save(cart1);
		
		Cart cart2 = new Cart();
		cart2.setCartId(2);
		cart2.setUser(userRepo.findById(2).get());
		cart2.setTotalAmount(0.0);
		cart2.setCartProducts(new ArrayList<CartProduct>());
		cartRepo.save(cart2);
		
		Product product1 = new Product();
		product1.setProductId(1);
		product1.setPrice(29190.0);
		product1.setProducName("Apple iPad 10.2 8th Gen WiFi iOS Tablet");
		product1.setCategory(categoryRepo.findById(2).get());
		product1.setSeller(userRepo.findById(3).get());
		productRepo.save(product1);
		
		Product product2 = new Product();
		product2.setProductId(2);
		product2.setPrice(10.0);
		product2.setProducName("Crocin pain relief tablet");
		product2.setCategory(categoryRepo.findById(5).get());
		product2.setSeller(userRepo.findById(4).get());
		productRepo.save(product2);
		
		Cart cart = cartRepo.findById(1).get();
		CartProduct cartProduct = new CartProduct();
		cartProduct.setCpId(1);
		cartProduct.setProduct(productRepo.findById(2).get());
		cartProduct.setCart(cartRepo.findById(1).get());
		cartProduct.setQuantity(2);
		
		cpRepo.save(cartProduct);
		
		CartProduct cp = cpRepo.findById(1).get();
		cart.getCartProducts().add(cp);
		cartRepo.save(cart);
		
	}

}
