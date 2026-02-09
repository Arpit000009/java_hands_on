package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
	public static Connection getConnection() {
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "postgres";
		String password = "IAMARPIT";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
