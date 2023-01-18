package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.model.User;

public interface UserDao {
	public int add(User user) throws SQLException;

	public int delete(String loginId) throws SQLException;

	public User getUser(String loginId) throws SQLException;

	public List<User> getUsers() throws SQLException;

	public int update(User user) throws SQLException;
}
