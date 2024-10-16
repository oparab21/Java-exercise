package HotelTest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.StatementEvent;

public class Main {

	public static void main(String[] args) {
		
		Main main=new Main();
		System.out.println("Enter a choice");
		System.out.println("1 --> Display data");
//		System.out.println("2 --> Add data");
//		System.out.println("3 --> Delete data");
		System.out.println("4 --> Update data");
		Scanner sc=new Scanner(System.in);
		String choice;
		choice=sc.next();
		if(choice.equals("1"))
		{
			FetchAllData.display();
		}
		else if(choice.equals("4"))
		{
			UpdateData.update();
		}
		else {
			System.out.println("thanks");
		}

	}
	
}





