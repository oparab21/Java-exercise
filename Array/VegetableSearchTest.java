package Array;

import java.util.Scanner;

public class VegetableSearchTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Available Vegetable");
		System.out.println("Enter No. of Vegetable");
		int n=sc.nextInt();
		int i=0;
		
		int VegId[]=new int[n];
		int VegQt[]=new int[n];
		double VegRate[]=new double[n];
		String VegDes[]=new String[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Id "+(i+1));
			VegId[i]=sc.nextInt();
			System.out.println("Enter des "+(i+1));
			VegDes[i]=sc.next();
			System.out.println("Enter Quantity "+(i+1));
			VegQt[i]=sc.nextInt();
			System.out.println("Enter Rate "+(i+1));
			VegRate[i]=sc.nextInt();
			
		}
		
		System.out.println("Id	 Quantity	Description	  Rate");
		for(i=0;i<n;i++)
		{
			System.out.println(VegId[i]+"	  "+VegQt[i]+"	         "+VegDes[i]+"		  "+VegRate[i]);
		}
		
		//  my way
		
//		System.out.println("What do you want?");
//		for(i=0;i<n;i++)
//		{
//			VegId[i]=VegId[i];
//			System.out.println("Enter des");
//			VegDes[i]=sc.next();
//			System.out.println("Enter Quantity");
//			VegQt[i]=sc.nextInt();
//			VegRate[i]=VegRate[i]*VegQt[i];
//			
//		}
//		double total=0;
//		
//		System.out.println("Id	 Quantity	Description	  Rate");
//		for(i=0;i<n;i++)
//		{
//			System.out.println(VegId[i]+"	  "+VegQt[i]+"	         "+VegDes[i]+"		  "+VegRate[i]);
//		total=VegRate[i]+total;
//			
//		}
//		System.out.println("							  "+total);
		
		// sir's way
		String choice;
		int yQt=0;
		double bill=0;
		System.out.println("Customer Buy");
		for(i=0;i<n;i++)
		{
//			bill=0;
			System.out.println(VegId[i]+"	  "+VegQt[i]+"	         "+VegDes[i]+"		  "+VegRate[i]);
			System.out.println("like to purchase from this list?");
			System.out.println("y for yes");
			choice=sc.next();
//			System.out.println("Enter vegetable id");
//			int idd=sc.nextInt();
//			idd=idd-1;
			if(choice.equals("y") || choice.equals("Y"))
			{
				System.out.println("Hou much?");
				yQt=sc.nextInt();
				bill=bill+yQt*VegRate[i];
			VegQt[i]=VegQt[i]-yQt;
			
				
//				System.out.println(VegId[i]+"	  "+yQt+"	         "+VegDes[i]+"		  "+bill);
				System.out.println();
			}
			System.out.println("Total bill : "+bill);
			
		}
		
		// top print customer's bill
//		System.out.println("Customer Bill");
//		for(i=0;i<n;i++)
//		{
//		
//			System.out.println(VegId[i]+"	  "+yQt+"	         "+VegDes[i]+"		  "+bill);
//			
//		}
		
		// for new customer
		
		System.out.println("any new customer?");
		String newCust=sc.next();
		if(newCust.equals("y"))
		{
			for(i=0;i<n;i++)
			{
				System.out.println(VegId[i]+"	  "+VegQt[i]+"	         "+VegDes[i]+"		  "+VegRate[i]);
				System.out.println("like to purchase from this list?");
				System.out.println("y for yes");
				choice=sc.next();
				if(choice.equals("y") || choice.equals("Y"))
				{
					System.out.println("Hou much?");
					yQt=sc.nextInt();
					bill=bill+yQt*VegRate[i];
					VegQt[i]=VegQt[i]-yQt;
					System.out.println(bill);
					System.out.println("Thanks");
				}
				
			}
		}
		else
		{
			System.out.println("Thanks");
		}
		
		
		
		System.out.println("Remamining quantity");
		System.out.println("Id	 Quantity	Description	  Rate");
		for(i=0;i<n;i++)
			{
			
				System.out.println(VegId[i]+"	  "+VegQt[i]+"	         "+VegDes[i]+"		  "+VegRate[i]);
				
			}
		//System.out.println("							  "+bill);
		
	}
}


