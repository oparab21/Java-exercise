package testThread;

class First extends Thread
{
	public void run()
	{
		System.out.println("I am from Run Method");
	}
	
	
}
//break

public class ThreadTest {

	public static void main(String[] args) {
		
		First first=new First();
		first.run();
		first.stop();
		

	}

}
