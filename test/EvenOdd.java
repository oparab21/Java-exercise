package test;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println("zero");
		}
		else if(num<0)
		{
			System.out.println("negative");
		}
		else if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		sc.close();
	}

}
