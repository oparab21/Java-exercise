package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
//		catch(ArithmeticException ar) {
//			System.out.println("deno cant be 0");
//		}
//		catch(InputMismatchException no) {
//			System.out.println("enter a numb");
//		}
		catch(Exception e) {
			System.out.println("this is your error "+e);
			TestException.main(args);
		}
		finally {
			System.out.println("I execute every time");
		}

	}

}
