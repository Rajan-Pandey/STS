package com.rajan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajan.springboot.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
