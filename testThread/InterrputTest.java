package testThread;


class TestInte implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			
		try {
			System.out.println("Hi from Thread Class "+i);
			Thread.sleep(2500);
			
		} catch (InterruptedException e) {
			System.out.println("I am stopping ");
			//return; stop
			
		} 	} } }


public class InterrputTest {

	public static void main(String[] args) {
TestInte inte=new TestInte();
Thread thread=new Thread(inte);
thread.start();

try {
	Thread.sleep(5000);
	thread.interrupt();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	System.out.println("Will i call ?");
}

		

	}

}
