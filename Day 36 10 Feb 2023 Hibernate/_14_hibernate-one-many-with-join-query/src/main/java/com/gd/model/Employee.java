package com.gd.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.gd.dto.EmployeeVehicleDto;

@NamedNativeQuery(name = "findAllEmployeeVehiclesMapping", resultClass = EmployeeVehicleDto.class, resultSetMapping = "findAllEmployeeVehiclesMapping", query = "SELECT `e`.`employee_id`, `e`.`employee_name`, `e`.`email`, `e`.`date_of_joing`, `e`.`salary`, `v`.`vehicle_id`, `v`.`number_plate`, `v`.`vehicle_model_name` FROM gd_hibernate.employee_table as e, gd_hibernate.vehicle_table as v WHERE e.employee_id=v.employee_id_fk;")
@SqlResultSetMapping(name = "findAllEmployeeVehiclesMapping", classes = @ConstructorResult(targetClass = EmployeeVehicleDto.class, columns = {
		@ColumnResult(name = "employee_id", type = Integer.class),
		@ColumnResult(name = "employee_name", type = String.class), 
		@ColumnResult(name = "email", type = String.class),
		@ColumnResult(name = "date_of_joing", type = Date.class),
		@ColumnResult(name = "salary", type = Double.class),
		@ColumnResult(name = "vehicle_id", type = Integer.class),
		@ColumnResult(name = "number_plate", type = String.class),
		@ColumnResult(name = "vehicle_model_name", type = String.class) }))
@Entity
@Table(name = "employee_table")
@DynamicUpdate
public class Employee {
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column(name = "employee_name", length = 100, nullable = false)
	private String employeeName;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "date_of_joing")
	private Date doj;

	@Column(name = "salary")
	private Double salary;

	public Employee(String employeeName, String email, Date doj, Double salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj="
				+ doj + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(doj, email, employeeId, employeeName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(doj, other.doj) && Objects.equals(email, other.email)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(salary, other.salary);
	}

}
