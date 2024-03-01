package com.ecom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tax")
public class TaxController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private TaxCalculationService taxCalculationService;
	
	@GetMapping
	public ResponseEntity<List<TaxDetails>> getDeductions() {
		List<Employee> employeeList = employeeService.getAllEmployees();
		List<TaxDetails> taxDetails = new ArrayList<TaxDetails>();
		
		for(Employee emp : employeeList) {
			taxDetails.add(taxCalculationService.calculateTax(emp));
			
		}
		return ResponseEntity.ok(taxDetails);
		
	}
	

}
