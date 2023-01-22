package com.revature.dao.impl;

import com.revature.model.User;

public interface UserDao {

	public boolean authenticate(User anyUser);
}
