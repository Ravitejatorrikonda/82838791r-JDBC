package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcResultSet {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/mydata82838791";
		final String username = "root";
		final String password = "123456";

		String query = "select * from st";

		try {
			// stage-1:-
			Connection connection = DriverManager.getConnection(URL, username, password);
			// stage-2:-
			Statement st = connection.createStatement();

			// stage-3:-

			ResultSet rs = st.executeQuery(query);
			
			//stage-4:-
			
			System.out.println("Id \t  Name \t Marks \t Age \t stLocation");
			while (rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int marks=rs.getInt(3);
				int age=rs.getInt(4);
				String loc=rs.getString(5);
				
				System.out.println(id+" \t"+name+" \t "+marks+" \t"+age+" \t"+loc);
				
				
			}
			
			
			
			
//			rs.next();
//			int id=rs.getInt("id");
//			System.out.println(id);
//			
//			rs.next();
//			int id2=rs.getInt("stmarks");
//			System.out.println(id2);
			
			
			
			
			//stage-5;
			
			connection.close();
			rs.close();
			
			
			
			
			
			
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
