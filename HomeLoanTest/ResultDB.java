package HomeLoanTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ResultDB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		try {
			int id=0,age=0;
			float Salary=0.0f,EMI,r,remaining,total,half;
			String Name=null,eligible=null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		System.out.println("Do u want a loan of 40lac?");
		String choice;
		choice=sc.next();
		if(choice.equals("y"))
		{
			
			System.out.println("Enter your name");
			Name=sc.next();
			System.out.println("your salary per months?");
			Salary=sc.nextInt();
			System.out.println("any other EMI?");
			EMI=sc.nextInt();
			r=Salary-EMI;
			System.out.println(r+" is your remaining Salary");
			System.out.println("can u pay half of your salary for home lone");
			choice=sc.next();
			if(choice.equals("y"))
			{
				half=r/2;
				System.out.println(half+"  is half of your salary");
				System.out.println("your age");
				age=sc.nextInt();
				remaining=60-age;
				System.out.println("so "+remaining+" years are remaining for your retairment");
				total=remaining*half*12;
				System.out.println("So we can give u a loan of "+total);
				if(total>4000000)
				{
					eligible="Yes";
				System.out.println("Which means u can have a loan of 40lac");
				}
				else
				{
					eligible="no";
					System.out.println("sorry u cant have loan of 40lac");
				}
			}
			else
			{
				System.out.println("Thanks");
			}
			
		}
		else
		{
			System.out.println("Thanks");
		}
		
		Statement statement=connection.createStatement();
		String query="insert into `testdb`.`loan`(`id`,`Name`,`Age`,`Salary`,`Eligible`) values('"+id+"','"+Name+"','"+age+"','"+Salary+"','"+eligible+"')";
		statement.executeUpdate(query);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
