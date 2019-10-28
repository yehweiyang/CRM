package com.bibby.crm.service.impl;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bibby.crm.domain.Employee;
import com.bibby.crm.service.IEmployeeService;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class EmployeeServiceTest extends TestCase{
	
	@Autowired
	IEmployeeService employeeService;

	@Test
	public void testSave() {
		Employee emp = new Employee();
		emp.setAdmin(true);
		emp.setEmail("tw00182691@gmail.com");
		emp.setInputtime(new Date());
		emp.setPassword("1qaz2wsx");
		emp.setState(true);
		emp.setTel("092785191981");
		emp.setUsername("admin");
		emp.setRealname("BIBBY");
		employeeService.save(emp);
	}

}
