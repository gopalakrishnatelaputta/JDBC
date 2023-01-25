package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;


public class Store_Image 
{
	public static void main(String[] args) throws IOException 
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement("insert into student(image)values(?)");
			FileInputStream fin=new FileInputStream("C:\\Users\\Sreenivas Bandaru\\Pictures\\Saved Pictures\\Image1.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i=ps.executeUpdate();
			System.out.println(i+"record inserted....");
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
