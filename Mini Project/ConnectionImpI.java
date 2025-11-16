package com.jdbc.project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionImpI implements IConnection {
	private static String URL="jdbc:mysql://localhost:3306/jdbc";
	private static String userName="root";
	private static String password="sukanya_2602";
	private static Connection con=null;
	private static Statement stmt=null;

	public Connection getConnection() {
		Connection con = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(URL, userName, password);
	            System.out.println(" Database connected successfully!");
	        } catch (Exception e) {
	            System.out.println("Connection failed: ");
	        }
	        return con;
	    }
	}

