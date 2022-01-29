package com.rajan.springboot;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rajan.springboot.model.Student;
import com.rajan.springboot.repository.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	@Test
	void testSaveStudents() {
		Student student = new Student();
		student.setId(1L);
		student.setName("Rajan");
		student.setTestScore(100);
		repository.save(student);
		
		Student savedstudent = repository.findById(1L).get();
		
		assertNotNull(savedstudent);
		
	}

}
