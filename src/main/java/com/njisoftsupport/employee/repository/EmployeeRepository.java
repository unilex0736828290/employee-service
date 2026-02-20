package com.njisoftsupport.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.njisoftsupport.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	Employee findById(int id);

}
