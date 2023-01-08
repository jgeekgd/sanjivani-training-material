package com.revature.model;

public class Jio extends SimCard {

	private String jioFiber;
	
	public Jio() {
		super();
	}

	public Jio(String serviceProvider, String contactNo, boolean fiveGenabled,String jioFiber ) {
		super(serviceProvider, contactNo, fiveGenabled);
		this.jioFiber=jioFiber;
	}

	@Override
	public String simCardDetails() {
		System.out.println("From Parent Class:"+ super.simCardDetails());
		return "simCardDetails Modified By Jio Child [serviceProvider=" + getServiceProvider() + ", contactNo=" + getContactNo() + ", fiveGenabled="
				+ (isFiveGenabled()?"Yes":"No") + "]";
	}
}

