package com.rajan.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajan.core.dao.PaymentDAO;

public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDAO dao;

	public int getdao(int a, int b)
	{
		return a+b;
	}
	
	public void setdao(PaymentDAO dao)
	{
		this.dao = dao;
	}
}
