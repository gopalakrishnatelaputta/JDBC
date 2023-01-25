package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Collable_statement
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);

			CallableStatement cs=con.prepareCall("{call insert6(?,?)}");
			
			cs.setInt(1, 103);
			cs.setString(2, "rahul");
			cs.execute();
			System.out.println("success");
			//System.out.println(cs.getString(2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
