package Oops;

import java.util.Scanner;

class Simple{
//	String a,b;
	int c;
	float p,q,d;
	public int add(String p,String q) {
		c=Integer.parseInt(p)+Integer.parseInt(q);
		return c;
	}
	public float div(String p, String q) {
		d=Float.parseFloat(p)/Float.parseFloat(q);
		return d;
	}
	public int sub(String p,String q) {
		c=Integer.parseInt(p)-Integer.parseInt(q);
		return c;
	}
	public int mul(String p,String q) {
		c=Integer.parseInt(p)*Integer.parseInt(q);
		return c;
	}
	
}
public class ReturnTypeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		
		Simple simple=new Simple();
		System.out.println("Add = "+simple.add(a,b));
		System.out.println("Sub = "+simple.sub(a,b));
		System.out.println("Multiplication = "+simple.mul(a,b));
		System.out.println("Div = "+simple.div(a, b));
	}

}

