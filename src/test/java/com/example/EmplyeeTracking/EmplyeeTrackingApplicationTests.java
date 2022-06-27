package com.example.EmplyeeTracking;

import com.example.EmplyeeTracking.models.Employee;
import com.example.EmplyeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmplyeeTrackingApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee derek = new Employee("Derek", 34, 1,"Derek@home.com");
		employeeRepository.save(derek);

	}

}
