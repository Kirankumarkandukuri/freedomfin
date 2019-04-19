package com.freedom.task.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freedom.task.dao.EmployeeRepo;
import com.freedom.task.dao.EmployeeRepoImpl;
import com.freedom.task.model.Employee;

@Service
public class EmployeeService {
	 private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeRepo freedomTaskRepo;
	
	@Autowired
	private EmployeeRepoImpl employeeRepoImpl;
	
	
	public Employee saveEmployee(Employee employee)
	{
		try {
		return freedomTaskRepo.save(employee);
		
		}
		catch(Exception e)

		{		log.error("Exception occured  "+ e);
			return null;
		}
	}
	
	public Employee getEmployeeById(String id)
	{
		try {
		return freedomTaskRepo.getOne(Long.parseLong(id));
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Employee record  "+ e);
			return null;
		}
	}
	
	public boolean deleteEmployeeById(String id)
	{
		try {
		 freedomTaskRepo.delete(Long.parseLong(id));
		 return true;
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Employee record  "+ e);
			return false;
		}
	}
	
	public boolean isEmployeeExists(String id)
	{
		try {
		 
		 return freedomTaskRepo.exists(Long.parseLong(id));
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Employee record  "+ e);
			return false;
		}
	}
	
	
	
	public Employee patchEmployee(Employee employee)
	{
		
		try {
		return employeeRepoImpl.patchEmployee(employee);
		
		}
		catch(Exception e)

		{		log.error("Exception occured  "+ e);
			return null;
		}
	}

}
