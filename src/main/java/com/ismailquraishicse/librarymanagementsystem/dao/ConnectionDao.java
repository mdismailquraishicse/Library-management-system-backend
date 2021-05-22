package com.ismailquraishicse.librarymanagementsystem.dao;

import java.sql.*;

public class ConnectionDao {
	
	
	private final String url = "jdbc:mysql://localhost:3306/library_management_system";
	private final String username ="root";
	private final String password = "";
    final Connection conn;
	
	
	public ConnectionDao() throws Exception {
		super();
		// TODO Auto-generated constructor stub
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection(url,username,password);
		//Statement statement = conn.createStatement();
		
	}
	
	
//	public static void main(String args[]) throws Exception {
//		
//		String url = "jdbc:mysql://localhost:3306/library_management_system";
//	   String username ="root";
//       String password = "I$m@il0180";
//		
//		String query = "select * from lbooks";
//		//Class.forName("com.mysql.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection(url,username,password);
//		Statement statement = conn.createStatement();
//		
//		
//		
//		ResultSet resultSet = statement.executeQuery(query);
//		
//		while(resultSet.next()) {
//			
//			String id = resultSet.getString("bid");
//			String title = resultSet.getString("btitle");
//			String author = resultSet.getString("bauthor");
//			String price = resultSet.getString("bprice");
//			System.out.println(id+" : "+title+" : "+author+" : "+price);
//		}
//	}
	
	
}
