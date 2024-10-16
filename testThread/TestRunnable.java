package testThread;

class TestInt implements Runnable
{

	@Override
	public void run() {
		System.out.println("I am from Thread");
		
	}
	
}



public class TestRunnable {

	public static void main(String[] args) {
		
		TestInt test=new TestInt();
		Thread thread=new Thread(test);
		thread.run();

	}

}
