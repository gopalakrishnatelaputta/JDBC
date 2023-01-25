package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Inserting_MultiplerecordsPRE_STA
{
	public static void main(String[] args) throws SQLException, NumberFormatException, IOException
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			do
			{
				System.out.println("Enter student id  :");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter Student Name  :");
				String Name=br.readLine();
				
				System.out.println("Enter student city");
				String city=br.readLine();
				stmt.setInt(1, id);
				stmt.setString(2, Name);
				stmt.setString(3, city);
				
				int i=stmt.executeUpdate();
				System.out.println(i+ "  records updated.....");
				System.out.println("Do you want to continue......");
				String s=br.readLine();
				
				if(s.startsWith("n"))
				{
					break;
			}
	}
		
			while(true);
			
				con.close();
	}
}
			
		
	


