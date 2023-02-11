package com.gd.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.gd.dto.EmployeePancardDto;

@NamedNativeQuery(name = "findAllEmployeePancardMapping", resultClass = EmployeePancardDto.class, resultSetMapping = "findAllEmployeePancardMapping", query = "SELECT `e`.`employee_id`, `e`.`employee_name`, `e`.`email`, `e`.`date_of_joing`, `e`.`salary`, `p`.`pancard_id`, `p`.`pancard_number`, `p`.`date_of_birth` FROM gd_hibernate.employee_table as e, gd_hibernate.pancard_table as p WHERE e.pancard_id_fk=p.pancard_id;")
@SqlResultSetMapping(name = "findAllEmployeePancardMapping", classes = @ConstructorResult(targetClass = EmployeePancardDto.class, columns = {
		@ColumnResult(name = "employee_id", type = Integer.class),
		@ColumnResult(name = "employee_name", type = String.class), 
		@ColumnResult(name = "email", type = String.class),
		@ColumnResult(name = "date_of_joing", type = Date.class),
		@ColumnResult(name = "salary", type = Double.class),
		@ColumnResult(name = "pancard_id", type = Integer.class),
		@ColumnResult(name = "pancard_number", type = String.class),
		@ColumnResult(name = "date_of_birth", type = Date.class) }))
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

	// Employee entity is owning side as it will have foreign key column from Pancard entity
	// @JoinColumn marks a column as a join column for an entity association or an element collection.
	// cascade = CascadeType.ALL, perform cascading while persisting (update/delete)
	// Employee tuples, Pancard tuples will also be persisted (updated/deleted).
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pancard_id_fk")
	private Pancard pancard;

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

	
	/**
	 * @return the pancard
	 */
	public Pancard getPancard() {
		return pancard;
	}

	/**
	 * @param pancard the pancard to set
	 */
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
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
