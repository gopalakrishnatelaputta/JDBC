package jdbc;
import java.sql.*;
public class Collable_StatementUpdate 
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="C##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			
			CallableStatement cs=con.prepareCall("{call Update1(?,?)}");
			
			cs.setInt(1, 105);
			cs.setString(2,"rahul");
			cs.executeUpdate();
			
			System.out.println("record updated....successfully");
		        con.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
