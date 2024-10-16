package test;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		
//		greater than
		
//		int a,b;
		int numb;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numb");
//		a=sc.nextInt();
//		b=sc.nextInt();
//		
//		if(a==b)
//		{
//			System.out.println("zero");
//		}
//		else if(a>b)
//		{
//			System.out.println("a is greater");
//		}
//		else {
//			System.out.println("b is greater");
//		}

//		factorial
		
		numb=sc.nextInt();
		for (int i=1;i<=numb;i++) 
		{
			
			fact*=i;	
		}
		System.out.println("Factorial="+fact);
		
		sc.close();
		
		

	}

}
