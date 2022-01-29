package com.rajan.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	private int testScore;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	
	
}
