package com.gd.dto;

import java.util.Date;

public class EmployeeVehicleDto {
	private Integer employeeId;
	private String employeeName;
	private String email;
	private Date doj;
	private Double salary;
	private Integer vehicleId;
	private String numberPlate;
	private String modelName;
	public EmployeeVehicleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeVehicleDto(Integer employeeId, String employeeName, String email, Date doj, Double salary,
			Integer vehicleId, String numberPlate, String modelName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
		this.vehicleId = vehicleId;
		this.numberPlate = numberPlate;
		this.modelName = modelName;
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
	 * @return the vehicleId
	 */
	public Integer getVehicleId() {
		return vehicleId;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @return the numberPlate
	 */
	public String getNumberPlate() {
		return numberPlate;
	}
	/**
	 * @param numberPlate the numberPlate to set
	 */
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}
	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "EmployeeVehicleDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", doj=" + doj + ", salary=" + salary + ", vehicleId=" + vehicleId + ", numberPlate=" + numberPlate
				+ ", modelName=" + modelName + "]";
	}

}