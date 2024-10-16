package test;

import java.util.Scanner;

public class Fabseries {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<=num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		sc.close();

	}

}
