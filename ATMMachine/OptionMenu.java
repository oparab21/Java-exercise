package ATMMachine;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{

	Scanner sc=new Scanner(System.in);
	int menuInput,selection;
//	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	
	HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
	
	
	public void getLogin()
	{
		int x=1;
		do {
		try {
			data.put(123456, 1234);
			data.put(234567, 5678);
			
			System.out.println("Welcome to ATM");
			System.out.println("Enter your account number");
			setCustomerNumber(sc.nextInt());
			
			System.out.println("Enter your Pin number");
			setPinNumber(sc.nextInt());
			
			
			
		} catch (Exception e) {
			System.out.println("\n"+"Invalid Char "+"\n");
			x=2;
		}
		
		for(Entry<Integer, Integer> entry:data.entrySet())
		{
			if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
			{
				getAccountType();
			}
			else
			{
				System.out.println("Wrong Account or PIN Number");
			}
		}
		System.out.println("Wrong Account or PIN Number");

		}
		 while(x==1);
	}
	
	
	public void getAccountType()
	{
		System.out.println("Select type of account");
		System.out.println("1-- Current Account");
		System.out.println("2-- Savings Account");
		System.out.println("3-- Exit");
		System.out.println("Choice:   ");
		
		selection=sc.nextInt();
		
		switch (selection) {
		case 1:
			getCurrent();
			break;
			
		case 2:
			getSavings();
			break;
			
		case 3:
			System.out.println("Thank u");
			break;

		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
			getAccountType();
			break;
		}
				
	}
	
	public void getCurrent()
	{
		System.out.println("Current Account");
		System.out.println("1-- View Balance");
		System.out.println("2-- Withdraw Balance");
		System.out.println("3-- Deposite Balance");
		System.out.println("4-- Exit");
		System.out.println("Choice:   ");
		
		selection=sc.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Current Account Balance: "+ moneyFormat.format(getCurrentBalance()));
			getAccountType();
			break;
			
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCurrentDepositeInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank u");
			
			break;

		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
			getAccountType();
			break;
		}
				
	}
	
	public void getSavings()
	{
		System.out.println("Savings Account");
		System.out.println("1-- View Balance");
		System.out.println("2-- Withdraw Balance");
		System.out.println("3-- Deposite Balance");
		System.out.println("4-- Exit");
		System.out.println("Choice:   ");
		
		selection=sc.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Savings Account Balance: "+ moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingsWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingsDepositeInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank u");
			
			break;

		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
			getAccountType();
			break;
		}
				
	}
	
	
}
