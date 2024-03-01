package com.ecom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee (@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
		return ResponseEntity.ok(employee);
	}
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
		
	}

}
