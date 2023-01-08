package com.revature.model;

public class Car {
	static {
		manufacturer="Hyundai India Private Limted";
	}
	private static String manufacturer;
	private String carName;
	private String carColor;
	private String carFeatures;
	private Long price;
	
	public Car() {
	}

	public Car(String carName, String carColor, String carFeatures, Long price) {
		this.carName = carName;
		this.carColor = carColor;
		this.carFeatures = carFeatures;
		this.price = price;
	}

	public static String getManufacturer() {
		return manufacturer;
	}

	public static void setManufacturer(String manufacturer) {
		Car.manufacturer = manufacturer;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarFeatures() {
		return carFeatures;
	}

	public void setCarFeatures(String carFeatures) {
		this.carFeatures = carFeatures;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
	

}
