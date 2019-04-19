package com.freedom.task.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freedom.task.dto.DepartmentDTO;
import com.freedom.task.model.Department;
import com.freedom.task.service.DepartmentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class DepartmentController {

	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService freedomTaskService;

	@ApiOperation(value = "Create a new Department")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Department.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "/department", method = RequestMethod.POST)
	public ResponseEntity<DepartmentDTO> createDepartment(@RequestBody DepartmentDTO departmentDTO) {

		log.info("Recieved a createDepartment Request" + departmentDTO.getDepartmentId());

		Department deptObj = Department.toDepartment(departmentDTO);
		deptObj = freedomTaskService.saveDepartment(deptObj);

		if (deptObj != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(departmentDTO);
		} else {
			log.error("Error: Unable to create Department: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@ApiOperation(value = "Get Department for {id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Department.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "department/{id}", method = RequestMethod.GET)
	public ResponseEntity<Department> getDepartment(@PathVariable(value = "id") String id) {

		boolean isDepartmentExists = freedomTaskService.isDepartmentExists(id);

		if (isDepartmentExists) {
			return ResponseEntity.status(HttpStatus.OK).body(freedomTaskService.getDepartmentById(id));
		} else {
			log.error("Error: Unable to find Department: {} ");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}

	}

	@ApiOperation(value = "Update an existing Department")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Department.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "/department/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Department> updateDepartment(@RequestBody Department Department,
			@PathVariable(value = "id") String id) {

		log.info("Recieved a Update Department Request" + Department.getId());
		// check if Department exists
		Department existingDepartment = freedomTaskService.getDepartmentById(id);
		if (existingDepartment == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		Department.setId(existingDepartment.getId());
		Department = freedomTaskService.saveDepartment(Department);
		if (Department != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(Department);
		} else {
			log.error("Error: Unable to create Department: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@ApiOperation(value = "Delete Department for {id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Department.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "department/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Department> deleteDepartment(@PathVariable(value = "id") String id) {
		Department existingDepartment = null;
		existingDepartment = freedomTaskService.getDepartmentById(id);

		if (existingDepartment == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		boolean isDeleted = freedomTaskService.deleteDepartmentById(id);
		if (isDeleted) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} else {
			log.error("Error: Unable to create Department: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}

}
