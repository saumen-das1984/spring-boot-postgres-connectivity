package com.signify.test.postgres.connectivity.service;

import java.util.List;

import com.signify.test.postgres.connectivity.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	void insertEmployee(Employee emp);
	void updateEmployee(Employee emp);
//	void executeUpdateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
}
