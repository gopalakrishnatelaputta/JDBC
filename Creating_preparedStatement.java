package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Creating_preparedStatement 
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
			stmt.setInt(1, 101);
			stmt.setString(2, "Krishna");
			stmt.setString(3, "Hyderabad");
			int i=stmt.executeUpdate();
			System.out.println(i+"records inserted....");
			
			//System.out.println("one record inserted......");
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
