package com.revature.service;

import com.revature.model.Car;

public class CarService {

	// do member variables
	// in real world we have many member variables
	// hence we dont make the methods in the service layer static
	
	public Car buildCar(String carName, String carColor, String carFeatures, Long price) {
		Car creta = new Car(carName,carColor,carFeatures,price);
		return creta;
	}

	public void getCarDetails(Car car) {
		System.out.println("-------Car Details-------");
		System.out.println("\t1.Manufacturer:" + Car.getManufacturer());
		System.out.println("\t2.Name of Car:" + car.getCarName());
		System.out.println("\t3.Color of Car:" + car.getCarColor());
		System.out.println("\t1.Features of Car:" + car.getCarFeatures());
		System.out.println("\t1.Price of Car:" + car.getPrice());
	}
	
	public void garage(Car anyCar, String newColor, String misc) {
		anyCar.setCarColor(newColor);
		anyCar.setCarFeatures(anyCar.getCarFeatures()+misc);
		
		anyCar=null;
		anyCar= new Car("Maruti 800", "No Idea", "Manual", 200000L);
	}

	public Car morphGarage(Car anyCar, String newColor, String misc) {
		anyCar.setCarColor(newColor);
		anyCar.setCarFeatures(anyCar.getCarFeatures()+misc);
		return anyCar;
	}
}
