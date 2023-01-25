package jdbc;
import java.sql.*;

public class Create_Statenment
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement stmt=con.createStatement();
			String sql1="insert into registration values(102,'Gopal','K',26)";
			String sql2="insert into registration values(103,'Gopi','t',26)";
			stmt.execute(sql2);
			System.out.println("one record inserted......");
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
