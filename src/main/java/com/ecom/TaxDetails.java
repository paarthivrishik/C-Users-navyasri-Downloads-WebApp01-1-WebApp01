package com.ecom;

import java.math.BigDecimal;

public class TaxDetails {
	
	private String employeeCode;
	private String firstName;
	private String lastName;
	
	private BigDecimal yearlySalary;
	private BigDecimal taxAmount;
	private BigDecimal cessAmount;
	/**
	 * @return the employeeCode
	 */
	public String getEmployeeCode() {
		return employeeCode;
	}
	/**
	 * @param employeeCode the employeeCode to set
	 */
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the yearlySalary
	 */
	public BigDecimal getYearlySalary() {
		return yearlySalary;
	}
	/**
	 * @param yearlySalary the yearlySalary to set
	 */
	public void setYearlySalary(BigDecimal yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	/**
	 * @return the taxAmount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	/**
	 * @return the cessAmount
	 */
	public BigDecimal getCessAmount() {
		return cessAmount;
	}
	/**
	 * @param cessAmount the cessAmount to set
	 */
	public void setCessAmount(BigDecimal cessAmount) {
		this.cessAmount = cessAmount;
	}
	
	

}
