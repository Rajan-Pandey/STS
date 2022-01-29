package com.rajan.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rajan.core.services.PaymentService;
import com.rajan.core.services.PaymentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {

	@Autowired
	Assignment service;
	
	
	@Test
	public void test() {
		assertEquals(36,service.sum(9, 27));
	}

}
                                         