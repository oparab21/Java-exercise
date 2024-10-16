package test;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int numb=sc.nextInt();
		int rem,rev=0;
		while(numb>0)
		{
			rem=numb%10;
			rev=rev*10+rem;
			numb=numb/10;
			
		}
		System.out.println(rev);
sc.close();
	}

}
