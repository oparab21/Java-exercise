package Array;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		int a[]=new int[6];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}

		for(int i=0;i<4;i++)
		{
			sum+=a[i];
		}
		System.out.println("Array Sum = "+sum);

		sc.close();
	}
	

}
