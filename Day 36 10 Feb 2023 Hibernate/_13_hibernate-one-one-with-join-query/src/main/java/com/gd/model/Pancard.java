package com.gd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "pancard_table")
@DynamicUpdate
public class Pancard {
	@Id
	@Column(name = "pancard_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pancardId;

	@Column(name = "pancard_number", length = 100, nullable = false)
	private String pancardNumber;

	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)   // No time part to be stored only date
	private Date dob;

	public Pancard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pancard(String pancardNumber, Date dob) {
		super();
		this.pancardNumber = pancardNumber;
		this.dob = dob;
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
		return "Pancard [pancardId=" + pancardId + ", pancardNumber=" + pancardNumber + ", dob=" + dob + "]";
	}
}