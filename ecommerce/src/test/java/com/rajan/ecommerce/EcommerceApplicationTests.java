package com.rajan.ecommerce;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rajan.ecommerce.models.Cart;
import com.rajan.ecommerce.models.CartProduct;
import com.rajan.ecommerce.models.Product;
import com.rajan.ecommerce.models.User;
import com.rajan.ecommerce.repo.CartProductRepo;
import com.rajan.ecommerce.repo.CartRepo;
import com.rajan.ecommerce.repo.CategoryRepo;
import com.rajan.ecommerce.repo.ProductRepo;
import com.rajan.ecommerce.repo.UserRepo;

import net.minidev.json.JSONArray;
import net.minidev.json.*;
import net.minidev.json.parser.JSONParser;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EcommerceApplicationTests {

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
	
	
	@Test
	@Order(1)
	public void test1() throws Exception {
		String[] categories = {"Fashion", "Electronics", "Books", "Groceries", "Medicines"};
		for(ListIterator<?> it = ((JSONArray) new JSONParser().parse(new ObjectMapper().writeValueAsString(categoryRepo.findAll()))).listIterator(); 
				it.hasNext();)
			assertEquals(categories[it.nextIndex()], ((JSONObject) it.next()).get("categoryName").toString());
		}
	
	@Test
	@Order(2)
	public void test2() throws Exception {
		String[] users = {"jack","bob","apple","glaxo"};
		for(ListIterator<?> it = ((JSONArray) new JSONParser()
				.parse(new ObjectMapper().writeValueAsString(userRepo.findAll()))).listIterator(); it.hasNext();)
		{
			assertEquals(users[it.nextIndex()],((JSONObject) it.next()).get("username").toString());
			assertEquals("pass_word",((JSONObject) it.next()).get("password").toString());
			
		}
	}

	@Test
	@Order(3)
	public void test3() throws Exception {
		String[] products = {"apple ipad 10.2 8th gen wifi ios tablet", "crocin pain relief tablet"};
		String[] prices = {"29190", "10"};
		for(ListIterator<?> it = ((JSONArray) new JSONParser()
				.parse(new ObjectMapper().writeValueAsString(productRepo.findAll()))).listIterator(); it.hasNext();)
		{
			assertEquals(products[it.nextIndex()],((JSONObject) it.next()).get("productName").toString().toLowerCase());
			assertEquals(prices[it.nextIndex()],
			String.valueOf(Math.round((Double) ((JSONObject) it.next()).get("price"))));
		}
	}
	
	@Test
	@Order(4)
	public void test4() throws Exception {
		List<Cart> arr = cartRepo.findAll();
		assertEquals(2,arr.size());
		assertEquals("20.0", arr.get(0).getTotalAmount().toString());
		assertEquals("0.0", arr.get(1).getTotalAmount().toString());
		assertEquals("2", arr.get(0).getCartProducts().get(0).getProduct().getProductId().toString());
		assertEquals("2", arr.get(0).getCartProducts().get(0).getQuantity().toString());
		assertEquals("10.0", arr.get(0).getCartProducts().get(0).getProduct().getPrice().toString());
		assertEquals("Crocin pain relief tablet", arr.get(0).getCartProducts().get(0).getProduct().getProductName().toString());
		assertEquals("5",arr.get(0).getCartProducts().get(0).getProduct().getCategory().getCategoryId().toString());
		assertEquals("Medicines",arr.get(0).getCartProducts().get(0).getProduct().getCategory().getCategoryName().toString());
		assertEquals(0,arr.get(1).getCartProducts().size());
	}
	
	@Test
	@Order(5)
	public void test5() throws Exception
	{
		User user = userRepo.findById(1).get();
		assertEquals("jack",user.getUsername());
		user.setUsername("jackie");
		userRepo.save(user);
		
		user = userRepo.findById(3).get();
		assertEquals("apple",user.getUsername());
		user.setUsername("apple inc");
		userRepo.save(user);
	}
	
	
	@Test
	@Order(6)
	public void test6() throws Exception
	{
		String[] users = {"jackie", "bob", "apple inc", "glaxo"};
		for(ListIterator<?> it = ((JSONArray) new JSONParser()
				.parse(new ObjectMapper().writeValueAsString(userRepo.findAll()))).listIterator(); it.hasNext();)
		{
			assertEquals(users[it.nextIndex()],((JSONObject) it.next()).get("username").toString());
			assertEquals("pass_word",((JSONObject) it.next()).get("password").toString());
			
		}
		
	}
	
	@Test
	@Order(7)
	public void test7() throws Exception
	{
		Product p = productRepo.findById(1).get();
		assertEquals("apple ipad 10.2 8th gen wifi ios tablet", p.getProductName().toString().toLowerCase());
		assertEquals("29190", String.valueOf(Math.round((Double) p.getPrice())));
		p.setProducName("apple iphone");
		p.setPrice(30000.0);
		productRepo.save(p);
	}
	
	@Test
	@Order(8)
	public void test8() throws Exception
	{
		String[] products = {"apple iphone" };
		String[] prices =  {"30000", "10"};
		for(ListIterator<?> it = ((JSONArray) new JSONParser()
				.parse(new ObjectMapper().writeValueAsString(productRepo.findAll()))).listIterator(); it.hasNext();)
		{
			assertEquals(products[it.nextIndex()],((JSONObject) it.next()).get("productName").toString().toLowerCase());
			assertEquals(prices[it.nextIndex()],
			String.valueOf(Math.round((Double) ((JSONObject) it.next()).get("price"))));
		}
	}
	
	@Test
	@Order(9)
	public void test9() throws Exception
	{
		Cart c = cartRepo.findById(1).get();
		User u = userRepo.findById(1).get();
		assertEquals(u.getUsername(),c.getUser().getUsername());
		System.out.println(u.getRoles());
		assert (u.getRoles().toString().contains("CONSUMER"));
		assert (!u.getRoles().toString().contains("SELLER"));
	}
	
	
	static CartProduct cp;
	@Test
	@Order(10)
	public void test10() throws Exception
	{
		Cart c = cartRepo.findById(1).get();
		assertEquals(1,c.getCartProducts().size());
		c.getCartProducts().remove(0);
		cartRepo.save(c);
		cp = cpRepo.findById(1).get();
		cpRepo.deleteById(1);
	}
	
	
	@Test
	@Order(11)
	public void test11() throws Exception
	{
		Cart c = cartRepo.findById(1).get();
		c = cartRepo.findById(1).get();
		assertEquals(0,c.getCartProducts().size());
	}
	
	@Test
	@Order(12)
	public void test12() throws Exception
	{
		assertEquals("crocin pain relief tablet", cp.getProduct().getProductName().toString().toLowerCase());
	}
	
	@Test
	@Order(13)
	public void test13() throws Exception
	{
		cp.setProduct(productRepo.findById(1).get());
		cpRepo.save(cp);
		List<CartProduct> cps = cpRepo.findAll();
		assertEquals(1,cps.size());
	}
	
	@Test
	@Order(14)
	public void test14() throws Exception
	{
		Cart c = cartRepo.findById(1).get();
		assertEquals("1",c.getUser().getUserId().toString());
		assertEquals("jackie",c.getUser().getUsername().toString());
	}

	@Test
	@Order(15)
	public void test15() throws Exception
	{
		Cart c = cartRepo.findById(1).get();
		assertEquals(1,c.getCartProducts().size());
		assertEquals("2",c.getCartProducts().get(0).getQuantity().toString());
		assertEquals("1",c.getCartProducts().get(0).getProduct().getProductId().toString());
		assertEquals("apple iphone", c.getCartProducts().get(0).getProduct().getProductName().toString().toLowerCase());
	}
}
