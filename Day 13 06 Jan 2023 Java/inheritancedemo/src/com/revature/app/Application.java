package com.revature.app;

import com.revature.model.Airtel;
import com.revature.model.Jio;
import com.revature.model.SimCard;
import com.revature.service.GoogleSearchService;

public class Application {

	public static void main(String[] args) {
		SimCard justDial=new SimCard("BSNL","8888888888",true);
		//System.out.println(justDial.simCardDetails());
	
		Airtel myNo= new Airtel("Airtel","7878787878",true,"Airtel XStream Box, Wynk Music");
		//System.out.println(myNo.airtelSimCardDetails());
		//System.out.println(myNo.simCardDetails());
		
		Jio companyNo= new Jio("Reliance Jio","9898989898",true,"3Gbps Jio Fiber");
		//System.out.println(companyNo.simCardDetails());
		
		//GoogleSearchService.simCardSearch(justDial);
		GoogleSearchService.simCardSearch(myNo);
		
		
		
		
		
		
	}

}
