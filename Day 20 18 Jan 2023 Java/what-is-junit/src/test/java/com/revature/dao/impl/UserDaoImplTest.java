package com.revature.dao.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.revature.model.User;

public class UserDaoImplTest {

	UserDao userDao;

	@Before
	public void setUp() {
		userDao = new UserDaoImpl();
	}

	@Test
	public void testAuthenticate_GD_User_tc1() {
		User gdUser = new User("GD", "GD@123", "ADMIN");
		boolean result=userDao.authenticate(gdUser);
		assertTrue(result);
	}
	@Test
	public void testAuthenticate_GD_User_tc2() {
		User gdUser = new User("", "GD@123", "ADMIN");
		boolean result=userDao.authenticate(gdUser);
		assertTrue(result);
	}
	@Test
	public void testAuthenticate_GD_User_tc3() {
		User gdUser = new User("GD", "", "ADMIN");
		boolean result=userDao.authenticate(gdUser);
		assertTrue(result);
	}
	@Test
	public void testAuthenticate_GD_User_tc4() {
		User gdUser = new User("", " ", "ADMIN");
		boolean result=userDao.authenticate(gdUser);
		assertTrue(result);
	}

}
