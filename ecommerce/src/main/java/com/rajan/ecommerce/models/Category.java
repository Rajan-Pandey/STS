package com.rajan.ecommerce.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer categoryId;
private String categoryName;

@OneToMany(fetch=FetchType.EAGER)
private List<Product> products;
public Category()
{
	super();
}
public Integer getCategoryId() {
	return categoryId;
}
public void setCategoryId(Integer categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
}
public Category(String categoryName) {
	super();
	this.categoryName = categoryName;
}

}
