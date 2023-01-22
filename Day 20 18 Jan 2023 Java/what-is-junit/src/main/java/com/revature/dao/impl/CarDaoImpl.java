package com.revature.dao.impl;

import com.revature.model.Car;

public class CarDaoImpl implements CarDao {

	private String newName;

	public CarDaoImpl(String newName) {
		this.newName = newName;
	}

	@Override
	public String changeName(Car car) {
		car.setCarName(this.newName);
		return car.getCarName();
	}

}
