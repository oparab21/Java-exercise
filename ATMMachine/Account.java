package ATMMachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	private int customerNumber,pinNumber;
	private double currentBalance=0,savingBalance=0;
	double amount;
	
	public double calcCurrentWithdraw(double amount)
	{
		currentBalance=currentBalance-amount;
		return currentBalance;
	}
	public double calcCurrentDeposite(double amount)
	{
		currentBalance=currentBalance+amount;
		return currentBalance;
	}
	
	public double calcSavingsWithdraw(double amount)
	{
		savingBalance=savingBalance-amount;
		return savingBalance;
	}
	public double calcSavingsDeposite(double amount)
	{
		savingBalance=savingBalance+amount;
		return savingBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public void getCurrentWithdrawInput()
	{
		System.out.println("Current Account Balance: "+ moneyFormat.format(currentBalance));
		System.out.println("Amount u want to withdraw");
		amount=sc.nextDouble();
		
		if((currentBalance-amount)>=0)
		{
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: "+ moneyFormat.format(currentBalance));
		}
		else {
			System.out.println("Balance Negative"+"\n");
		}

	}
	public void getCurrentDepositeInput()
	{
		System.out.println("Current Account Balance: "+ moneyFormat.format(currentBalance));
		System.out.println("Amount u want to Deposite");
		amount=sc.nextDouble();
		
		if((currentBalance+amount)>=0)
		{
			calcCurrentDeposite(amount);
			System.out.println("New Current Account Balance: "+ moneyFormat.format(currentBalance));
		}
		else {
			System.out.println("Balance Negative"+"\n");
		}

	}
	
	public void getSavingsWithdrawInput()
	{
		System.out.println("Savings Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount u want to withdraw");
		amount=sc.nextDouble();
		
		if((savingBalance-amount)>=0)
		{
			calcSavingsWithdraw(amount);
			System.out.println("New Savings Account Balance: "+ moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance Negative"+"\n");
		}

	}
	public void getSavingsDepositeInput()
	{
		System.out.println("Savings Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount u want to Deposite");
		amount=sc.nextDouble();
		
		if((savingBalance+amount)>=0)
		{
			calcSavingsDeposite(amount);
			System.out.println("New Savings Account Balance: "+ moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance Negative"+"\n");
		}

	}
	
	
	
	
	
}
