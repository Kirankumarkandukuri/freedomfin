package com.freedom.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freedom.task.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
 Employee patchEmployee(Employee employee);
}
