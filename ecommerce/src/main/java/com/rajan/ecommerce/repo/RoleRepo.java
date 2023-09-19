package com.rajan.ecommerce.repo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.ecommerce.models.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {
}
