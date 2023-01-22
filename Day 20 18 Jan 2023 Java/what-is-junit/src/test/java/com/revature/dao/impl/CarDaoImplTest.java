package com.revature.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.revature.model.Car;

public class CarDaoImplTest {

	
	@Test
	public void testChangeName_GD_Car() {
		

		Car gdCar = new Car("Maruti 800");
		String previousName = gdCar.getCarName();

		CarDao carDao = new CarDaoImpl("BMW X1");
		carDao.changeName(gdCar);

		String postChangedName = gdCar.getCarName();

		assertNotEquals(previousName, postChangedName);

	}

	@Test
	public void testChangeNam_Revature_Car() {

		Car revatureCar = new Car("BMW X7");
		String previousName = revatureCar.getCarName();

		CarDao carDao = new CarDaoImpl("Audi Q7");
		carDao.changeName(revatureCar);

		String postChangedName = revatureCar.getCarName();

		assertNotEquals(previousName, postChangedName);

	}

}
