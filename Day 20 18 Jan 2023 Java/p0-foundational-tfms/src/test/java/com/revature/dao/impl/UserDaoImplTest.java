package com.revature.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.revature.dao.UserDao;
import com.revature.model.User;
import com.revature.util.DateTimeUtil;

public class UserDaoImplTest {

	UserDao userDao;

	@Before
	public void setUp() throws Exception {
		System.out.println("---------UserDaoImplTest before every test---------");
		userDao = new UserDaoImpl();

	}

	@Test
	public void testInsertUser() {
		User toBeInserted = new User("user1", "user1pass@123", DateTimeUtil.getCurrentDateTime());
		User inserted = null;
		try {
			userDao.add(toBeInserted);
			inserted = userDao.getUser(toBeInserted.getLoginId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertEquals(toBeInserted.getLastModifiedDateTime(), inserted.getLastModifiedDateTime());
		assertEquals(toBeInserted.getPassword(), inserted.getPassword());
	}
	@Test
	public void testDeleteUser() {
		User deleted = null;
		try {
			userDao.delete("user1");
			deleted = userDao.getUser("user1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertNull(deleted);
	}
}