package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatements {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/mydata82838791";
		final String username = "root";
		final String password = "123456";
		
		String query="insert into st values(?,?,?,?,?)";
		Scanner sc=new Scanner(System.in);
		
		 try {
			 //stage-1
		Connection connection=	DriverManager.getConnection(URL,username,password);
			
			//stage-2
			PreparedStatement ps= connection.prepareStatement(query);
			
			
			int count=0;
			
			while(count<5) {
				System.out.println("Enter ST ID : ");
				int id=Integer.parseInt(sc.nextLine());
				
				System.out.println("ENter Studdent Name : ");
				String name=sc.nextLine();
				
				System.out.println("Enter Student marks : ");
				int marks=Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Student Age : ");
				int age=Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Student Loc : ");
				String loc=sc.nextLine();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, marks);
				ps.setInt(4, age);
				ps.setString(5, loc);
				int rows=ps.executeUpdate();
				System.out.println(count+" : inserted...");
				count++;
			}
			
			
			
			
			//stage-3
			
			
			
			//stage-4
			
			//stage-5
			
			connection.close();
			ps.close();
			sc.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
