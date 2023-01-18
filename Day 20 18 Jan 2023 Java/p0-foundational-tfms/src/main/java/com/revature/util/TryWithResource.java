package com.revature.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResource {
	public static void main(String[] args) {

		// https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
		// Auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName
		// Register JDBC driver, optional since java 1.6
		/*
		 * try{ 
		 * 
		 * Class.forName("com.mysql.jdbc.Driver"); 
		 * 
		 * }catch (ClassNotFoundException  e) 
		 * { 
		 * 	 e.printStackTrace(); 
		 * }
		 * 
		 */

		// Auto close connection using try with resources
		try (Connection conn = DriverManager.getConnection("jdbc:mysq"
				+ "l://127.0.0.1:3306/world", "root", "admin")) {

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
	}
}
