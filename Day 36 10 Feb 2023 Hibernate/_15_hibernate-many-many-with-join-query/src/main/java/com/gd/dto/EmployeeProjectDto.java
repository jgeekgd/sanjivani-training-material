package com.gd.dto;

import java.util.Date;

public class EmployeeProjectDto {
	private Integer employeeId;
	private String employeeName;
	private String email;
	private Date doj;
	private Double salary;
	private Integer projectId;
	private String projectName;
	private String projectClientName;
	private String billingCurrency;
	private String totalBudget;
	public EmployeeProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeProjectDto(Integer employeeId, String employeeName, String email, Date doj, Double salary,
			Integer projectId, String projectName, String projectClientName, String billingCurrency,
			String totalBudget) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectClientName = projectClientName;
		this.billingCurrency = billingCurrency;
		this.totalBudget = totalBudget;
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
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectClientName
	 */
	public String getProjectClientName() {
		return projectClientName;
	}
	/**
	 * @param projectClientName the projectClientName to set
	 */
	public void setProjectClientName(String projectClientName) {
		this.projectClientName = projectClientName;
	}
	/**
	 * @return the billingCurrency
	 */
	public String getBillingCurrency() {
		return billingCurrency;
	}
	/**
	 * @param billingCurrency the billingCurrency to set
	 */
	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}
	/**
	 * @return the totalBudget
	 */
	public String getTotalBudget() {
		return totalBudget;
	}
	/**
	 * @param totalBudget the totalBudget to set
	 */
	public void setTotalBudget(String totalBudget) {
		this.totalBudget = totalBudget;
	}
	@Override
	public String toString() {
		return "EmployeeProjectDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", doj=" + doj + ", salary=" + salary + ", projectId=" + projectId + ", projectName=" + projectName
				+ ", projectClientName=" + projectClientName + ", billingCurrency=" + billingCurrency + ", totalBudget="
				+ totalBudget + "]";
	}

}
