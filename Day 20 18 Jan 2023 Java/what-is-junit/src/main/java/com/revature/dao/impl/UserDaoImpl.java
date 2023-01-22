package com.revature.dao.impl;

import com.revature.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean authenticate(User anyUser) {
		if (anyUser.getUsername() != anyUser.getPassword() && anyUser.getRole() == "ADMIN") {
			return true;
		} else
			return false;

	}

}
