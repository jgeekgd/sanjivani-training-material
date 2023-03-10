package com.revature.service;

import com.revature.model.SimCard;

public class SimCardService {

	public void getSimCardDetails(SimCard card) {
		System.out.println("---- Sim Card Details ----");
		System.out.println("\t1.Service Provider:" + card.getServiceProvider());
		System.out.println("\t2.Contact Number: " + card.getContactNo());
		System.out.println("\t3.Is 5G enabled?: " + (card.isFiveGenabled() ? "YES" : "NO"));
	}
}
