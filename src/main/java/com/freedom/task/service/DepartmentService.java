package com.freedom.task.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freedom.task.dao.DepartmentRepo;
import com.freedom.task.model.Department;

@Service
public class DepartmentService {
	 private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	private DepartmentRepo freedomTaskRepo;
	
	
	public Department saveDepartment(Department Department)
	{
		try {
		return freedomTaskRepo.save(Department);
		
		}
		catch(Exception e)

		{		log.error("Exception occured  "+ e);
			return null;
		}
	}
	
	public Department getDepartmentById(String id)
	{
		try {
		return freedomTaskRepo.getOne(Long.parseLong(id));
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Department record  "+ e);
			return null;
		}
	}
	
	public Department getDepartmentByDepartmentId(String id)
	{
		try {
		return freedomTaskRepo.findByDepartmentId(id);
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Department record  "+ e);
			return null;
		}
	}
	
	public boolean deleteDepartmentById(String id)
	{
		try {
		 freedomTaskRepo.delete(Long.parseLong(id));
		 return true;
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Department record  "+ e);
			return false;
		}
	}
	
	public boolean isDepartmentExists(String id)
	{
		try {
		 
		 return freedomTaskRepo.exists(Long.parseLong(id));
		}
		catch(Exception e)
		{
			log.error("Exception occured while fetching Department record  "+ e);
			return false;
		}
	}
	
	

}
