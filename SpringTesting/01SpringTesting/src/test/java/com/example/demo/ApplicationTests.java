package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controllers.EmployeeController;

@SpringBootTest
class ApplicationTests {

	@Autowired
	  EmployeeController employeeController;
	 
	  @Test
	  public void contextLoads() {
	   // Assertions.assertThat(employeeController).isNot(null);
	    Assertions.assertNotEquals(employeeController, null);
	    
	  }

}
