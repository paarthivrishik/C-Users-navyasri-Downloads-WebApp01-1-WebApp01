package com.ecom;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculationService {
	
	public TaxDetails calculateTax (Employee employee) {
		
		TaxDetails td = new TaxDetails();
		td.setEmployeeCode(employee.getCode());
		td.setFirstName(employee.getFirstName());
		td.setLastName(employee.getLastName());
		td.setYearlySalary(employee.getSalary());
		
		if(employee.getSalary().compareTo(new BigDecimal("250000"))>0 && employee.getSalary().compareTo(new BigDecimal("500000"))<=0 ) {
			td.setTaxAmount(employee.getSalary().subtract(new BigDecimal("250000")).multiply(new BigDecimal("0.05")));
		}
		else if(employee.getSalary().compareTo(new BigDecimal("500000"))>0 && employee.getSalary().compareTo(new BigDecimal("1000000"))<=0 ) {
			td.setTaxAmount(employee.getSalary().subtract(new BigDecimal("250000")).multiply(new BigDecimal("0.10")));
		}
		else if(employee.getSalary().compareTo(new BigDecimal("1000000"))>0 ) {
			td.setTaxAmount(employee.getSalary().subtract(new BigDecimal("250000")).multiply(new BigDecimal("0.20")));
		}
		
		if(employee.getSalary().compareTo(new BigDecimal("2500000"))>0) {
			td.setCessAmount(employee.getSalary().multiply(new BigDecimal("0.05")));
		}
		return td;
	}

}
