package com.cg.payroll.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectionProvider {
	private static Connection conn;

	public static Connection getDBConnectionProvider() {
		
		try {
			Properties dbProperties = new Properties();
			dbProperties.load(new FileInputStream(new File(".//resources//payroll.properties")));
			String driver = dbProperties.getProperty("driver");
			String url = dbProperties.getProperty("url");
			String user = dbProperties.getProperty("user");
			String password = dbProperties.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
