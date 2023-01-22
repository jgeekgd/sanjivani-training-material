package com.revature.model;

public class Car {

	private String carName;

	public Car(String carName) {
		super();
		this.carName = carName;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}

}
