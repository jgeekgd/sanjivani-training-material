package com.gd.dto;

import java.util.Date;

public class EmployeePancardDto {
	private Integer employeeId;
	private String employeeName;
	private String email;
	private Date doj;
	private Double salary;
	private Integer pancardId;
	private String pancardNumber;
	private Date dob;

	public EmployeePancardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePancardDto(Integer employeeId, String employeeName, String email, Date doj, Double salary,
			Integer pancardId, String pancardNumber, Date dob) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
		this.pancardId = pancardId;
		this.pancardNumber = pancardNumber;
		this.dob = dob;
	}

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @return the pancardId
	 */
	public Integer getPancardId() {
		return pancardId;
	}

	/**
	 * @param pancardId the pancardId to set
	 */
	public void setPancardId(Integer pancardId) {
		this.pancardId = pancardId;
	}

	/**
	 * @return the pancardNumber
	 */
	public String getPancardNumber() {
		return pancardNumber;
	}

	/**
	 * @param pancardNumber the pancardNumber to set
	 */
	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "EmployeePancardDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", doj=" + doj + ", salary=" + salary + ", pancardId=" + pancardId + ", pancardNumber="
				+ pancardNumber + ", dob=" + dob + "]";
	}
}
