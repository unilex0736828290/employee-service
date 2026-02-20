package com.njisoftsupport.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njisoftsupport.employee.entity.Employee;
import com.njisoftsupport.employee.repository.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployeeId(int id) {
		
		Employee employee = employeeRepository.findById(id);
		
		return employee;
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
