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

import com.freedom.task.dto.EmployeeDTO;
import com.freedom.task.model.Department;
import com.freedom.task.model.Employee;
import com.freedom.task.service.DepartmentService;
import com.freedom.task.service.EmployeeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService freedomTaskService;

	@Autowired
	private DepartmentService departmentService;

	@ApiOperation(value = "Create a new employee")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Employee.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO) {

		log.info("Recieved a createEmployee Request" + employeeDTO.getAddress());

		Employee employee = Employee.toEmployee(employeeDTO);
		Department department = departmentService.getDepartmentByDepartmentId(employeeDTO.getDepartmentId());
		if (null == department) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		employee.setDepartment(department);
		employee = freedomTaskService.saveEmployee(employee);

		if (employee != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		} else {
			log.error("Error: Unable to create Employee: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@ApiOperation(value = "Get Employee for {id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Employee.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable(value = "id") String id) {

		boolean isEmployeeExists = freedomTaskService.isEmployeeExists(id);

		if (isEmployeeExists) {
			return ResponseEntity.status(HttpStatus.OK)
					.body(Employee.fromEmployee(freedomTaskService.getEmployeeById(id)));
		} else {
			log.error("Error: Unable to find Employee: {} ");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}

	}

	@ApiOperation(value = "Update an existing employee")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Employee.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDTO employeeDTO,
			@PathVariable(value = "id") String id) {

		log.info("Recieved a Update Employee Request" + id);
		// check if Employee exists
		Employee existingEmployee = freedomTaskService.getEmployeeById(id);
		if (existingEmployee == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		Employee employee = Employee.toEmployee(employeeDTO);
		employee.setId(existingEmployee.getId());
		Department department = departmentService.getDepartmentByDepartmentId(employeeDTO.getDepartmentId());
		if (null == department) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		employee.setDepartment(department);
		employee = freedomTaskService.saveEmployee(employee);
		if (employee != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		} else {
			log.error("Error: Unable to create Employee: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@ApiOperation(value = "Delete Employee for {id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Employee.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "employee/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") String id) {
		Employee existingEmployee = null;
		existingEmployee = freedomTaskService.getEmployeeById(id);

		if (existingEmployee == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		boolean isDeleted = freedomTaskService.deleteEmployeeById(id);
		if (isDeleted) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} else {
			log.error("Error: Unable to create Employee: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}

	@ApiOperation(value = "Patch an existing employee")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Employee.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Failure"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 406, message = "NOT ACCEPTABLE") })
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Employee> patchEmployee(@RequestBody Employee employee,
			@PathVariable(value = "id") String id) {

		log.info("Recieved a Update Employee Request" + employee.getId());
		// check if Employee exists
		Employee existingEmployee = freedomTaskService.getEmployeeById(id);
		if (existingEmployee == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		employee.setId(existingEmployee.getId());
		employee = freedomTaskService.patchEmployee(employee);
		if (employee != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		} else {
			log.error("Error: Unable to create Employee: {} ");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
