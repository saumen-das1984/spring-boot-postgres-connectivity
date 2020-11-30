package com.signify.test.postgres.connectivity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.signify.test.postgres.connectivity.dao.EmployeeDao;
import com.signify.test.postgres.connectivity.dao.EmployeeRepository;
import com.signify.test.postgres.connectivity.entity.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired 
	EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}
	@Override
	public void insertEmployee(Employee emp) {
		employeeRepo.save(emp);
		
	}
	@Override
	public void updateEmployee(Employee emp) {
		employeeRepo.updateEmployee(emp.getEmployee_id(),emp.getEmployee_address(), emp.getEmployee_name(), emp.getEmployee_email());
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeRepo.delete(emp);
		
	}
}