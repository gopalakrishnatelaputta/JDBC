package jdbc;

import java.sql.*;

public class Creating_table 
{
	public static void main(String[] args) 
	{
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##batch4pm", "system");
			Statement stmt=con.createStatement();
			String sql = "CREATE TABLE Registra_ion " +
					"(id INTEGER not NULL, " +
					" first VARCHAR(255), " +
					" last VARCHAR(255), " +
					" age INTEGER, " +
					" PRIMARY KEY ( id ))";
			stmt.executeQuery(sql);
			System.out.println("Table created in the database.....");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
