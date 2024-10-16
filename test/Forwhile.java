package test;

import java.util.Scanner;

public class Forwhile {

	public static void main(String[] args) {
		int i;
				
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter number");
			
			int numb=sc.nextInt();
			System.out.println("With for");
			for(i=1;i<=10;i++)
			{
				System.out.println(numb+"*"+i+"="+numb*i);
			}
			System.out.println("With while");
			i=1;
			while(i<=10)
			{
				System.out.println(numb+"*"+i+"="+numb*i);
				i++;
			}
			sc.close();
		}

	}

}
