package com.edugroupe.congo.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		String JDBCurl = "jdbc:mysql://localhost:3306/testlundi?useSSL=false";
		String user ="root";
		String pass = "dba2";
		
		try {
			
			Connection con = DriverManager.getConnection(JDBCurl, user, pass);
			
			System.out.println("connection OK");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
