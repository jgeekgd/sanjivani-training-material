package com.revature.service;

import com.revature.model.SimCard;

public class GoogleSearchService {

	// Dynamic Polymorphysm/Late Binding/Runtime Ploymorphysm
	// At rutime overrriden method are invoked of child type for the argument of parent type.
	public static void simCardSearch(SimCard anySimCard) {
		System.out.println(anySimCard.simCardDetails());
	}

}
