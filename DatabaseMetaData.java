package jdbc;

import java.sql.*;

public class DatabaseMetaData 
{
	public static void main(String[] args)
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			java.sql.DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getURL());
			System.out.println(dbmd.getUserName());
			System.out.println(dbmd.getProcedureTerm());
			con.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
