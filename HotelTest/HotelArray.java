package HotelTest;

import java.util.Scanner;

public class HotelArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Available Hotels");
//		System.out.println("Enter No. of Vegetable");
		int n=sc.nextInt();
		int i=0;
		
		int HotelId[]=new int[n];
		int HotelQt[]=new int[n];
		double HotelRate[]=new double[n];
		String HotelName[]=new String[n];
		String HotelDes[]=new String[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Id "+(i+1));
			HotelId[i]=sc.nextInt();
			System.out.println("Enter Name "+(i+1));
			HotelName[i]=sc.next();
			System.out.println("Enter des "+(i+1));
			HotelDes[i]=sc.next();
			System.out.println("Enter Quantity "+(i+1));
			HotelQt[i]=sc.nextInt();
			System.out.println("Enter Rate "+(i+1));
			HotelRate[i]=sc.nextInt();
			
		}
		
		System.out.println("Id	 Quantity     Name  	Description	  Rate");
		for(i=0;i<n;i++)
		{
			System.out.println(HotelId[i]+"	  "+HotelQt[i]+"   "+HotelName[i]+"	         "+HotelDes[i]+"		  "+HotelRate[i]);
		}
		
		
		String choice;
		int yQt=0;
		double bill=0;
		System.out.println("Customer Buy");
		for(i=0;i<n;i++)
		{
//			bill=0;
			System.out.println(HotelId[i]+"	  "+HotelQt[i]+"         "+HotelName[i]+"	         "+HotelDes[i]+"		  "+HotelRate[i]);
			System.out.println("like to purchase from this list?");
			System.out.println("y for yes");
			choice=sc.next();
			if(choice.equals("y") || choice.equals("Y"))
			{
				System.out.println("Hou much?");
				yQt=sc.nextInt();
				bill=bill+yQt*HotelQt[i];
				HotelQt[i]=HotelQt[i]-yQt;
			
				
//				System.out.println(VegId[i]+"	  "+yQt+"	         "+VegDes[i]+"		  "+bill);
				System.out.println();
			}
			System.out.println("Total bill : "+bill);
			
		}

	}

}
