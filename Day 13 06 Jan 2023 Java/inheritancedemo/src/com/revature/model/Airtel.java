package com.revature.model;

public class Airtel extends SimCard {

	private String additionlServices;

	public Airtel() {
		super();
	}

	public Airtel(String serviceProvider, String contactNo, boolean fiveGenabled, String additionlServices) {
		super(serviceProvider, contactNo, fiveGenabled);
		this.additionlServices = additionlServices;
	}

	public String getAdditionlServices() {
		return additionlServices;
	}

	public void setAdditionlServices(String additionlServices) {
		this.additionlServices = additionlServices;
	}

	public String airtelSimCardDetails() {
		return "Airtel [additionlServices=" + additionlServices + "]";
	}

	@Override  // This annotation checks if the rules of overriding methods are adhered.
	public String simCardDetails() {
		System.out.println("From Parent Class:"+ super.simCardDetails());
		return "simCardDetails Modified By Airtel Child [serviceProvider=" + getServiceProvider() + ", contactNo=" + getContactNo() + ", fiveGenabled="
				+ (isFiveGenabled()?"Yes":"No") + "]";
	}
	
}
