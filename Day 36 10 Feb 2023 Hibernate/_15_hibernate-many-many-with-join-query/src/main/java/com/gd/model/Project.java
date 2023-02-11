package com.gd.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "project_table")
@DynamicUpdate
public class Project {
	@Id
	@Column(name = "project_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;

	@Column(name = "project_name", length = 100, nullable = false)
	private String projectName;

	@Column(name = "project_client_name", unique = true)
	private String projectClientName;

	@Column(name = "billing_currency")
	private String billingCurrency;

	@Column(name = "total_budget")
	private String totalBudget;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, String projectClientName, String billingCurrency, String totalBudget) {
		super();
		this.projectName = projectName;
		this.projectClientName = projectClientName;
		this.billingCurrency = billingCurrency;
		this.totalBudget = totalBudget;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectClientName() {
		return projectClientName;
	}

	public void setProjectClientName(String projectClientName) {
		this.projectClientName = projectClientName;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public String getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(String totalBudget) {
		this.totalBudget = totalBudget;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectClientName="
				+ projectClientName + ", billingCurrency=" + billingCurrency + ", totalBudget=" + totalBudget + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(billingCurrency, projectClientName, projectId, projectName, totalBudget);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(billingCurrency, other.billingCurrency)
				&& Objects.equals(projectClientName, other.projectClientName)
				&& Objects.equals(projectId, other.projectId) && Objects.equals(projectName, other.projectName)
				&& Objects.equals(totalBudget, other.totalBudget);
	}

}