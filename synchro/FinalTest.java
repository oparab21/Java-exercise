package synchro;

public class FinalTest {

	public static void main(String[] args) {
		
		Bank bank=new Bank();
	
		for(int i=0;i<Bank.Max_acc;i++)
		{
			
		Thread thread=new Thread(new Transacation(bank, i));
		thread.start();
		}
		
	}

}
