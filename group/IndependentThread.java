package group;

public class IndependentThread extends Thread
{

	public IndependentThread( ThreadGroup group,String name) {
		super(group,name);
	}
	
	public void run() // when i call start
	{
		boolean test=true;
		while(test)
		{
			try {
				Thread.sleep(1000); // 9 sec
				System.out.println(getName()+ "is up now");
			} catch (InterruptedException e) {
				test=false;
				System.out.println(getName()+ "is not up now and Terminated");
				
			}
		}
	}
}
