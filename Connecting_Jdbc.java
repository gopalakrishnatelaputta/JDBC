package jdbc;

import java.sql.*;

public class Connecting_Jdbc {
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##batch4pm", "system");
			System.out.println("Successfully connected to database");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
