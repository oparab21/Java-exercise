package InterfaceTest;

class PC implements Computer{

	@Override
	public void CPU() {
		System.out.println("Intel");
		
	}

	@Override
	public void moniter() {
		System.out.println("Benq");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Logitech");
		
	}

	@Override
	public void mouse() {
		System.out.println("Logitech");
		
	}
	
}

public class Account1
{
	public static void main(String[]arg) {
		PC com=new PC();
		com.CPU();
		com.moniter();
		com.keyboard();
		com.mouse();
		
	}



	
}
