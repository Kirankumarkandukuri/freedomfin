package com.freedom.task.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.freedom.task.dto.EmployeeDTO;

import lombok.Data;


@Entity
@Table(name="employee")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue
	 private long id;
	     
	 private String firstName;
	 
	 private String address;
	 
	 private String lastName;
	 
	  @JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
	  @ManyToOne( cascade = CascadeType.ALL)
	  @JsonBackReference
	  private Department department;

	  
	  public static Employee toEmployee(EmployeeDTO employeeDTO )
		 {
		  Employee employee = new Employee();
		  employee.setAddress(employeeDTO.getAddress());
		  employee.setFirstName(employeeDTO.getFirstName());
		  employee.setLastName(employeeDTO.getLastName());
		  
		  return employee;
		 
		 }
	  
	  
	  public static EmployeeDTO fromEmployee(Employee employee )
		 {
		  EmployeeDTO dto = new EmployeeDTO();
		  dto.setAddress(employee.getAddress());
		  dto.setFirstName(employee.getFirstName());
		  dto.setLastName(employee.getLastName());
		  dto.setDepartmentId(employee.getDepartment().getDepartmentId());
		  return dto;
		 
		 }
			 

}
