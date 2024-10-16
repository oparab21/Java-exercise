package Array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i=0;
		boolean present=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 elements");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int item;
		System.out.println("Enter element to find");
		item=sc.nextInt();
		for(i=0;i<5;i++)
		{
			if(item==a[i])
			{
				present=true;
				break;				
			}
		}
		if (present==true)
		{
			System.out.println("found on position "+(i+1));

		}
		else
		{
			System.out.println("not found");
		}
		sc.close();
	}
}
