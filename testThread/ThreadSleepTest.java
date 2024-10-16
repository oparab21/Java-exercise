package testThread;


class OneThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi from One Thread Class "+i);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			System.out.println("Resumed one");
		}
		
		}
	}
}


//break
class TwoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi from two Thread Class "+i);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			System.out.println("Resumed two");
		}
		
		}
	}
}


class ThreeThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi from three Thread Class "+i);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			System.out.println("Resumed Three");
		}
		
		}
	}
}



public class ThreadSleepTest {

	public static void main(String[] args) {
		try
		{
		OneThread one=new OneThread();
		TwoThread two=new TwoThread();	
		ThreeThread three=new ThreeThread();
		one.setPriority(10);
		two.setPriority(4);
		three.setPriority(1);
		one.start();
		two.start();
		three.start();

		}
		catch(Exception e)
		{
			
		}
	}

}
