package Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter at position "+i+" is = "+a[i]);
		}
		sc.close();
	}
	

}
