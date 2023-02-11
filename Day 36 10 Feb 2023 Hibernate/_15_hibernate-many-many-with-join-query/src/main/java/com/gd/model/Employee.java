package com.gd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.gd.dto.EmployeeProjectDto;

@NamedNativeQuery(name = "findAllEmployeeProjectMapping", resultClass = EmployeeProjectDto.class, resultSetMapping = "findAllEmployeeProjectMapping", query = "SELECT `e`.`employee_id`, `e`.`employee_name`, `e`.`email`, `e`.`date_of_joing`, `e`.`salary`, `p`.`project_id`, `p`.`project_name`, `p`.`project_client_name`, `p`.`total_budget`, `p`.`billing_currency` FROM gd_hibernate.employee_table as e, gd_hibernate.employee_project as ep, gd_hibernate.project_table as p WHERE e.employee_id=ep.EMPLOYEE_ID AND ep.PROJECT_ID=p.project_id Order by 1; ")
@SqlResultSetMapping(name = "findAllEmployeeProjectMapping", classes = @ConstructorResult(targetClass = EmployeeProjectDto.class, columns = {
		@ColumnResult(name = "employee_id", type = Integer.class),
		@ColumnResult(name = "employee_name", type = String.class), 
		@ColumnResult(name = "email", type = String.class),
		@ColumnResult(name = "date_of_joing", type = Date.class), 
		@ColumnResult(name = "salary", type = Double.class),
		@ColumnResult(name = "project_id", type = Integer.class),
		@ColumnResult(name = "project_name", type = String.class),
		@ColumnResult(name = "project_client_name", type = String.class),
		@ColumnResult(name = "billing_currency", type = String.class),
		@ColumnResult(name = "total_budget", type = String.class) }))
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

	// cascade = CascadeType.ALL, perform cascading while persisting (update/delete)
	// Employee tuples, Project tuples will also be persisted (updated/deleted).
	// @JoinTable indicates that there is a link table which joins two tables via
	// containing there keys.This annotation is mainly used on the owning side of
	// the relationship.
	// joinColumns refers to the column name of owning side
	// and inverseJoinColumns refers to the column of inverse side of relationship

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EMPLOYEE_PROJECT", joinColumns = { @JoinColumn(name = "EMPLOYEE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "PROJECT_ID") })
	private List<Project> projects = new ArrayList<Project>();

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, String email, Date doj, Double salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
	}

	public Employee(String employeeName, String email, Date doj, Double salary, List<Project> projects) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
		this.projects = projects;
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
	 * @return the subjects
	 */
	public List<Project> getProjects() {
		return projects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj="
				+ doj + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(doj, email, employeeId, employeeName, salary, projects);
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
				&& Objects.equals(salary, other.salary) && Objects.equals(projects, other.projects);
	}

}
