package com.gd.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "vehicle_table")
@DynamicUpdate
public class Vehicle {
	@Id
	@Column(name = "vehicle_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;

	@Column(name = "number_plate", length = 100, nullable = false)
	private String numberPlate;

	@Column(name = "vehicle_model_name")
	private String modelName;

	// Vehicle entity is owning side as it will have foreign key column from
	// Employee entity
	// @JoinColumn marks a column as a join column for an entity association or an
	// element collection.
	// cascade = CascadeType.ALL, perform cascading while persisting (update/delete)
	// Vehicle tuples, Employee tuples will also be persisted (updated/deleted).

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id_fk")
	private Employee employee;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String numberPlate, String modelName) {
		super();
		this.numberPlate = numberPlate;
		this.modelName = modelName;
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

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee, modelName, numberPlate, vehicleId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(employee, other.employee) && Objects.equals(modelName, other.modelName)
				&& Objects.equals(numberPlate, other.numberPlate) && Objects.equals(vehicleId, other.vehicleId);
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", numberPlate=" + numberPlate + ", modelName=" + modelName
				+ ", employee=" + employee + "]";
	}
}