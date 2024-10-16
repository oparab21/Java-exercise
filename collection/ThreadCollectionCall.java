package collection;

import java.util.Set;

public class ThreadCollectionCall {

	public static void main(String[] args) {
		
		Set<Thread> set=Thread.getAllStackTraces().keySet();//fetch the status of JVM thread
	
		for(Thread th:set)
		{
			String name=th.getName();
			Thread.State state=th.getState();
			int pri=th.getPriority();
			 boolean  test=th.isDaemon();// true 
			 String msg=test?"Daemon":"Normal";
			 System.out.printf("%-15s \t %s \t %d \t %s \n"   ,name,state,pri,msg);
			
		}
		

	}

}
