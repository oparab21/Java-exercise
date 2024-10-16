package Oops;

class Cash
{
	public static void paper() {
		System.out.println("In paper format");
	}
}

class ATM extends Cash
{
	public static void plastic() {
		System.out.println("From Atm machine");
	}
}

class UPI extends ATM
{
	public static void digital() {
		System.out.println("No cash requierd");
	}
}



public class InheritanceCall {

	public static void main(String[] args) {
		
		UPI.paper();
		UPI.plastic();
		UPI.digital();
//		

	}

}
