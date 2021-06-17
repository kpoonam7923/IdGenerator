package com.idgenerators.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.idgenerators.demo.entities.Employee;
import com.idgenerators.demo.repository.EmployeeRepos;

@SpringBootTest
class IdgeneratorsApplicationTests {
	
	@Autowired
	EmployeeRepos repo;

	@Test
	void contextLoads() {
	}
	
	//manuaaly assigned ID value
//	@Test
//	public void create() {
//		Employee e = new Employee();
//		e.setId(1);
//		e.setName("ABC");
//		repo.save(e);
//	}
	
	// Auto increment ID
	@Test
	@Rollback(false) 
	public void create() {
		Employee e = new Employee();
		e.setName("ABC");
		repo.save(e);
	}
	
	

}
