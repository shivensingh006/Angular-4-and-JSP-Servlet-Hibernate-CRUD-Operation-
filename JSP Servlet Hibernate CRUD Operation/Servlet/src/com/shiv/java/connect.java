package com.shiv.java;

import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class connect {
	public static void main(String[] args) {
		try{   
		Class.forName("com.mysql.jdbc.Driver"); 
		String url = "jdbc:mysql://localhost:3306/activity";
		String root = "root";
		String password="admin";
		Connection con=(Connection) DriverManager.getConnection(url,root,password);  
		System.out.print(con);
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from phoneactivity where Country like 'AUS%'");
		while(rs.next())  
		System.out.println(rs.getString("Country"));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}
}

