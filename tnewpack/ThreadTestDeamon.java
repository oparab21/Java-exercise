package tnewpack;

public class ThreadTestDeamon {

	public static void main(String[] args) {

		Thread thread=new Thread(new Runnable() {// user thread
			//break
			@Override
			public void run() {
			
				int a=10;
				
				while(a>0)
				{
					System.out.println("User Thread-"+a--);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
		
		
		
		Thread dThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				while(true)
				{
					System.out.println("Daemon Thread is running");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		dThread.setDaemon(true);
		dThread.start();
				
		
	}

}
