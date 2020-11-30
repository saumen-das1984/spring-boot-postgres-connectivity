package com.signify.test.postgres.connectivity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.signify.test.postgres.connectivity.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Modifying
    @Query("UPDATE Employee emp SET emp.employee_address = :employee_address, emp.employee_name = :employee_name, emp.employee_email = :employee_email WHERE emp.employee_id = :employee_id")
    int updateEmployee(@Param("employee_id") int employee_id, @Param("employee_address") String employee_address, @Param("employee_name") String employee_name, @Param("employee_email") String employee_email);
}
