package com.rajan.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String role;
	
	@OneToOne
	private User user;
	public Role()
	{
		super();
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Role(String role) {
		super();
		this.role = role;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", role=" + role + ", user=" + user + "]";
	}
	
	
}
