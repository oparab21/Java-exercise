package HotelTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllData {
	public static void display(){
		try
		{
			Connection connection=Dbconnect.dbConnection();
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from result ");// to show any one row use ex "where id=4" after result
		System.out.println(rs);
		while(rs.next())
			{
				System.out.println(rs.getInt(1)+"        "+rs.getString(2)+"        "+rs.getInt(3)+"        "+rs.getInt(4)+"        "+rs.getInt(5)+"        "+rs.getInt(6)+"        "+rs.getInt(7)+"        "+rs.getInt(8));
			}
		
		System.out.println("done");
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
