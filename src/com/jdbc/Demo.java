package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/mydata82838791";
		final String username = "root";
		final String password = "123456";

//		String query = "insert into student values(102,'vijay',90,49,'HYD')";
		
//		String query="update student set stloc='KPHB' where id=101";
		
		String query="delete from student where id=102";

		try {
			// stage-1
			Connection connection = DriverManager.getConnection(URL, username, password);

			// stage-2:-

			Statement st = connection.createStatement();

			// stage-3:-
			int rows = st.executeUpdate(query);
			
			System.out.println(rows+" : inserted....");
			
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
