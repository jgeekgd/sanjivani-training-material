package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicJdbcSteps {
	public static void main(String[] args) throws SQLException {
		// _1_//Add pom.xml jar dependency
		_2_loadDriver();
		Connection connection = _3_GetDbConnection();
		// Statements allow to issue SQL queries to the database
		Statement statement = connection.createStatement();
		// Result set get the result of the SQL query
		ResultSet resultSet = statement
				.executeQuery(" SELECT `LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED` FROM `gd`.`authentication` ");
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String userid = resultSet.getString("LOGIN_ID");
			String password = resultSet.getString("PASSWORD");
			String lastModifiedDateTime = resultSet.getString("LAST_MODIFIED");
			System.out.println("User ID: " + userid);
			System.out.println("Password: " + password);
			System.out.println("Last Modified On: " + lastModifiedDateTime);
		}

	}

	private static Connection _3_GetDbConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" + "/gd", "root", "admin");

			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private static void _2_loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
