package group;

public class ThreadGroupMain {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup threadGroup=new ThreadGroup("A");
		ThreadGroup threadGroup1=new ThreadGroup("B");
		new IndependentThread(threadGroup,"B").start();
		IndependentThread two=new IndependentThread(threadGroup,"C");
		two.start();
		new IndependentThreadTwo(threadGroup1, "D").start();
		
		//break
		
		// will this program run once or not ?
	//	Thread.sleep(1000);
		
		Thread.sleep(11000000);// holding process to be interrupted
		threadGroup.interrupt();
		threadGroup1.interrupt();
		
	}

}
