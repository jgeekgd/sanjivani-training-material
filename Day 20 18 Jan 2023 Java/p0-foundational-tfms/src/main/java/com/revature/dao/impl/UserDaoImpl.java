package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.UserDao;
import com.revature.model.User;

/**
 * PreparedStatement:
 * https://www.mysqltutorial.org/calling-mysql-stored-procedures-from-jdbc
 *
 */

public class UserDaoImpl implements UserDao {
	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
   //private static final Logger logger = LogManager.getLogger(UserDaoImpl.class);  

	private static Connection con = DatabaseConnection.getConnection();

	@Override
	public int add(User user) throws SQLException {
		String insertQuery = Constant.INSERT_QUERY;
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, user.getLoginId());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getLastModifiedDateTime());
		logger.debug("I wan to inspect PreparedStatement object: "+ps);
		int n = ps.executeUpdate();
		ps.close();
		
//		try {
//			
//		}catch(Exception e) {
//			logger.error("Exception:"+e.getMessage());
//		}
		logger.info("Added User Details.");
		return n;
	}

	@Override
	public int delete(String loginId) throws SQLException {
		String deleQquery = Constant.DELETE_QUERY;
		PreparedStatement ps = con.prepareStatement(deleQquery);
		ps.setString(1, loginId);
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public User getUser(String loginId) throws SQLException {
		String selectSpecificQuery = Constant.SELECT_SPECIFIC_QUERY;
		PreparedStatement ps = con.prepareStatement(selectSpecificQuery);
		ps.setString(1, loginId);
		User user = new User();
		ResultSet rs = ps.executeQuery();
		boolean found = false;
		while (rs.next()) {
			found = true;
			user.setLoginId(rs.getString("LOGIN_ID"));
			user.setPassword(rs.getString("PASSWORD"));
			user.setLastModifiedDateTime(rs.getString("LAST_MODIFIED"));
		}
		if (found == true) {
			return user;
		} else
			return null;
	}

	@Override
	public List<User> getUsers() throws SQLException {
		String selectAllQuery = Constant.SELECT_ALL_QUERY;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs = ps.executeQuery();
		List<User> users = new ArrayList<User>();

		while (rs.next()) {
			User user = new User();
			user.setLoginId(rs.getString("LOGIN_ID"));
			user.setPassword(rs.getString("PASSWORD"));
			user.setLastModifiedDateTime(rs.getString("LAST_MODIFIED"));
			users.add(user);
		}
		return users;
	}

	@Override
	public int update(User user) throws SQLException {
		String updateQuery = Constant.UPDATE_QUERY;
		PreparedStatement ps = con.prepareStatement(updateQuery);
		ps.setString(1, user.getPassword());
		ps.setString(2, user.getLastModifiedDateTime());
		ps.setString(3, user.getLoginId());
		int n = ps.executeUpdate();
		return n;
	}
}