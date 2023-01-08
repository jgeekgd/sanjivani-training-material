package com.revature.app;

import com.revature.model.SimCard;
import com.revature.service.SimCardService;

public class Application {

	public static void main(String[] args) {
		SimCardService simCardService=new SimCardService();
		SimCard justDial=new SimCard("Airtel","8888888888",true);
		simCardService.getSimCardDetails(justDial);

	}

}
