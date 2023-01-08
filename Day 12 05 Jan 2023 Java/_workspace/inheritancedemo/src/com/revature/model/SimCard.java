package com.revature.model;

public class SimCard {
	private String serviceProvider;
	private String contactNo;
	private boolean fiveGenabled;
	
	public SimCard() {
	}
	public SimCard(String serviceProvider, String contactNo, boolean fiveGenabled) {
		super();
		this.serviceProvider = serviceProvider;
		this.contactNo = contactNo;
		this.fiveGenabled = fiveGenabled;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public boolean isFiveGenabled() {
		return fiveGenabled;
	}
	public void setFiveGenabled(boolean fiveGenabled) {
		this.fiveGenabled = fiveGenabled;
	}
	

	
	
}
