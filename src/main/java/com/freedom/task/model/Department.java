package com.freedom.task.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.freedom.task.dto.DepartmentDTO;

import lombok.Data;


@Entity
@Table(name="department")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue
	 private long id;
	     
	 private String departmentId;
	 
	 private String departmentName;
	 
	 @OneToMany(mappedBy = "department" , cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	 @JsonManagedReference
	  private List<Employee> employeeCollection;
	 

	 public static Department toDepartment(DepartmentDTO departmentDTO )
	 {
		 Department department = new Department();
		 department.setDepartmentId(departmentDTO.getDepartmentId());
		 department.setDepartmentName(departmentDTO.getDepartmentName());
		 return department;
	 }
	 
}
