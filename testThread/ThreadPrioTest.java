package testThread;

class TestPrority extends Thread
{
	
}

public class ThreadPrioTest extends Thread 
{
//break
	public static void main(String[] args) {
	
		Thread t1=new Thread();
		t1.setPriority(8);
		int holdPri=t1.getPriority();
		System.out.println(holdPri);
		TestPrority prority=new TestPrority();
		ThreadPrioTest test=new ThreadPrioTest();
		System.out.println("For main class="+test.getPriority());
		prority.setPriority(Thread.NORM_PRIORITY);
//		System.out.println(prority.getPriority());

	}

}
