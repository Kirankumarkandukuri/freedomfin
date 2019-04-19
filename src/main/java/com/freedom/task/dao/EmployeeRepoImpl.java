package com.freedom.task.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.freedom.task.model.Employee;

@Repository
public class EmployeeRepoImpl  {
	
	@PersistenceContext
    private EntityManager entityManager;

	
	 @Transactional
	public Employee patchEmployee(Employee employee) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaUpdate<Employee> query = cb.createCriteriaUpdate(Employee.class);
        
        Root<Employee> root = query.from(Employee.class);
        if(null != employee.getFirstName())
        query.set("firstName", employee.getFirstName());
        
        if(null != employee.getAddress())
            query.set("address", employee.getAddress());
        
        if(null != employee.getLastName())
            query.set("lastName", employee.getLastName());
        
        query.where(root.get("id").in(employee.getId()));
        this.entityManager.createQuery(query).executeUpdate();
		return employee;
	}

}
