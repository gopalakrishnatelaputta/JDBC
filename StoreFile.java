package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreFile {

	
	public static void main(String[] args) throws IOException {
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="c##batch4pm";
		String pass="system";
		
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement("insert into image(StoreFile)values(?)");
			FileInputStream fin=new FileInputStream("C:\\Users\\Sreenivas Bandaru\\eclipse-workspace\\advanced_java\\src\\jdbc\\Connecting_Jdbc.java");
			ps.setBinaryStream(1, fin, fin.available());
			int i=ps.executeUpdate();
			System.out.println(i+"record inserted....");
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
