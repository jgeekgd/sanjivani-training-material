package com.revature.app;

import com.revature.model.Car;
import com.revature.service.CarService;
import com.revature.util.Calculator;

public class App {

	public static void main(String[] args) {
		CarService carService= new CarService();
		Car creta=carService.buildCar("Creta 2023", "White", "Automatic", 2800000L);
		//carService.getCarDetails(creta);
		Car venue=carService.buildCar("Venue 2023", "Red", "Manual", 1800000L);
		carService.getCarDetails(venue);
		//usingCalcaultorUtil();
		
		carService.garage(venue, "Orange", ", Cycle stand");
		
		carService.getCarDetails(venue);
		
		Car grandi10=carService.morphGarage(new Car("Grand i10", "Blue", "Automatic", 600000L), "Orange", ", Cycle stand");
		carService.getCarDetails(grandi10);
		
		//Call By Value
		int x=10;
		int y=20;
		System.out.printf("x= %d & y =%d",x,y);
		Calculator.add(x, y);
		System.out.printf("\nx= %d & y =%d",x,y);
	}

	private static void usingCalcaultorUtil() {
		System.out.println(Calculator.add(12, 12));
		System.out.println(Calculator.div(12, 12));
		System.out.println(Calculator.mod(12, 12));
		System.out.println(Calculator.mul(12, 12));
		System.out.println(Calculator.sub(12, 12));
	}

}
