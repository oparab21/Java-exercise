package synchro;

public class Account {

	int balance=0;

	public Account(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount)
	{
		this.balance=this.balance- amount;
	}
	
	public void deposit(int amount) //5000
	{
		this.balance=this.balance+amount;  //50000+5000=55000
	}
	
	protected int getBalance() {
		return balance;
	}
	

	
	
	
}
