package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManager
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			con.setAutoCommit(false); 
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into student1 values(190,'abhi')");  
			stmt.executeUpdate("insert into student1 values(191,'umesh')");  
			System.out.println("records iserted and committed....");
			  
			con.commit();  
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
