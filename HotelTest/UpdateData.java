package HotelTest;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
	public static void update(){
		try
		{
			Scanner sc=new Scanner(System.in);
			String Name;
			int id,Phy,Math,Chem;
			System.out.println("Please enter Id");
			id=sc.nextInt();
			Name=sc.next();
			Phy=sc.nextInt();
			Math=sc.nextInt();
			Chem=sc.nextInt();				
			Connection connection=Dbconnect.dbConnection();
		Statement statement=connection.createStatement();
		String query="UPDATE `testdb`.`result` SET `Name` = '"+Name+"',`Phy` = '"+Phy+"',`Math` = '"+Math+"',`Chem` = '"+Chem+"' WHERE (`id` = '"+id+"')";
		statement.executeUpdate(query);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
