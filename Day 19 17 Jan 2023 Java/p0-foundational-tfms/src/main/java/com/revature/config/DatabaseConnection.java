package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Singleton Pattern says that just- "Define a class that has only one instance
 * and provides a global point of access to it".
 * 
 * 
 * For stand alone DB application we will prefer to use only single DB
 * connection through out application.
 */

public class DatabaseConnection {
	private static Connection connection = null;

	private DatabaseConnection() {
	}

	public static Connection getConnection() {
		if (connection == null) {
			ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
			String driver = resourceBundle.getString("driver");
			String dburl = resourceBundle.getString("dburl");
			String username = resourceBundle.getString("username");
			String password = resourceBundle.getString("password");

			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(dburl, username, password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
