package HotelTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	public static Connection dbConnection()
	{
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
