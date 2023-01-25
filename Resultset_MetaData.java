package jdbc;

import java.sql.*;

public class Resultset_MetaData
{
	public static void main(String[] args) 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			
			PreparedStatement stmt=con.prepareStatement("Select * from student");
			//ResultSet rs=stmt.executeQuery();
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			System.out.println(n);
			for(int i=1;i<=n;i++)
			{
			System.out.print(rsmd.getColumnName(i)+"\t");
			//con.close();
			}
			System.out.println();
			System.out.println();
			while(rs.next())
			{
				//System.out.print("\t");
				System.out.print(rs.getInt(1)+"\t");
				//System.out.println();
				System.out.print(rs.getString(2)+"\t");
				//System.out.println();
				System.out.print(rs.getString(3)+"\t");
				System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
