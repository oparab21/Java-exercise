package testThread;

class TestIntenew implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi from Thread Class "+i);
			if(Thread.interrupted())
			{
				System.out.println("I am stopping");
				return;
			}
			} } }


public class InterTest {

	public static void main(String[] args) {
TestIntenew inte=new TestIntenew();
Thread thread=new Thread(inte);
thread.start();

try {
	Thread.sleep(10);
	thread.interrupt();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	System.out.println("Will i call ?");
}

		

	}

}