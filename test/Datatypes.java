package test;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numb=sc.nextInt();
		int a;
		int result=0;
		while(numb>0)
		{
			a=numb%10;
			System.out.println(a);
			result=result+a;
			numb=numb/10;
			
		}
		System.out.println("Result="+result);
		sc.close();

	}

}
