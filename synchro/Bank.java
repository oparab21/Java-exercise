package synchro;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

	public static final int Max_acc=10;
	public static final int Opening_balanace=1000;
	
	
	Account[] accounts=new Account[Max_acc];
	
	private Lock bankLock; 
	private Condition fund;
	
	
	public Bank() {
	System.out.println("I was called");
		for(int i=0;i<accounts.length;i++)
		{
			
			accounts[i]=new Account(Opening_balanace);//10000rs 
		}	
	
	
	bankLock=new ReentrantLock();
	fund=bankLock.newCondition();
	
	}
	

	public void transfer(int from,int to,int amount)
	{
		bankLock.lock();// is lock 
		try
		{
			
		while(accounts[from].getBalance()<amount)//asking for 10000 and dont have in account
		{
			fund.await();
		}
			
//		if(amount<=accounts[from].getBalance())//10000
//		{
//			accounts[from].withdraw(amount);//from 1st account 
			accounts[to].deposit(amount); // second account 
			String threadTransfer=Thread.currentThread().getName();
			System.out.printf("%s trasferd %d from %s to %s, Total Balance %d \n ",threadTransfer,from,to,amount,getTotalaBalance());
			// after this line we are unlocking our code 
		
		//}
				fund.signalAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			bankLock.unlock();
		}
	}
	
	
	public int getTotalaBalance()
	{
		bankLock.lock();
		try
		{
		int rest=0;
		for(int i=0;i<accounts.length;i++)
		{
			rest=rest+accounts[i].getBalance();//check balance
		}
		System.out.println("Balance="+rest);
	return rest;
		}
		finally {
			bankLock.unlock();
		}
	}
	
	
	
}
