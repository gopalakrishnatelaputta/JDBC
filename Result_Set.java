package jdbc;

import java.sql.*;

public class Result_Set 
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("Select * from student");
			rs.absolute(5);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
