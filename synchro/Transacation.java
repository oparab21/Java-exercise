package synchro;

public class Transacation implements Runnable 
{
     private Bank bank;
     private int fromAcc;
	
     
     
     
	public Transacation(Bank bank, int fromAcc) {
		this.bank = bank;
		this.fromAcc = fromAcc;
	}


	@Override
	public void run() {

		while(true)
		{
			int toAcc=(int) (Math.random()*Bank.Max_acc);
			
			if(toAcc==fromAcc) continue;
			
			int amount=(int) (Math.random()*Bank.Max_acc);
			if(amount==0) continue;
			bank.transfer(fromAcc, toAcc, amount);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
