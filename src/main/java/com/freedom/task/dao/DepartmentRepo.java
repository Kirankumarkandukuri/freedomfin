package com.freedom.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.freedom.task.model.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
	
	Department findByDepartmentId(@RequestParam("departmentId") String departmentId);

}
