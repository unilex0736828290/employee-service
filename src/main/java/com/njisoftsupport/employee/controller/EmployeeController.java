package com.njisoftsupport.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.njisoftsupport.employee.entity.Employee;
import com.njisoftsupport.employee.repository.EmployeeRepository;
import com.njisoftsupport.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employees/{id}")
	
	Employee getEmployeeDetails(@PathVariable("id")int id){
		
		Employee employee = employeeService.getEmployeeById(id);
		
		return employee;
		
	}

}
