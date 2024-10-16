package states;

public class ThreadState {

	public static void main(String[] args) throws InterruptedException   {

		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				Thread th=Thread.currentThread();
				System.out.println(th.getState());
				
			}
		});
		//break
		System.out.println(thread.getState());
		thread.start();
		thread.join();
		
		//thread.join();
		//Thread.sleep(5000);
//		 if(thread.getState()==Thread.State.TERMINATED)
//		 {
//			 System.out.println(thread.getState());
//		 }
		 System.out.println(thread.getState());
	}

}
