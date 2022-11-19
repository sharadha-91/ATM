package com.app.optionmenu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double currentBalance=0;
	private double savingBalance =0;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	


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

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	//calculate checking account withdrawl
	public double calCurrentWithdraw(double amount) {
		currentBalance = currentBalance-amount;
		return currentBalance;
	}
	
   //calculate saving account withdrawl
	public  double calSavingWithdraw(double amount) {
		savingBalance = savingBalance-amount;
		return savingBalance;		
	}
	//calculate current account deposit
	public double calCurrentDeposit(double amount) {
		currentBalance = currentBalance+amount;
		return currentBalance;
	}
	
	public double calSavingDeposit(double amount) {
		savingBalance = savingBalance+amount;
		return savingBalance;
		
	}
	
	//customer checking account withdraw input
	public void getCurrentWithdrawInput() {
		
		System.out.println("\n   Current Checkings Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("\n   Amount you want to withdraw from Checkings Account: ");
		
		
		double amount = sc.nextDouble();
		if ((currentBalance - amount) >= 0 && amount >= 0) {
			calCurrentWithdraw(amount);
			System.out.println("\n"+       " Current Checkings Account Balance: " + moneyFormat.format(currentBalance));
			
		} else {
			System.out.println("\nBalance Cannot be Negative." +"\n");
		}
		
		
	}
	
	public void getSavingsWithdrawInput() {
		
		System.out.println("\n"+   " Current Savings Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("\n   Amount you want to withdraw from Savings Account: ");
		
		double amount = sc.nextDouble();
		if ((savingBalance - amount) >= 0 && amount >= 0) {
			calSavingWithdraw(amount);
			System.out.println("\n    Current Savings Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("\nBalance Cannot Be Negative.");
		}
		
		
	}
	
	//customer checking Account Deposit input
	
	public void getCurrentDepositInput() {
		System.out.println("\n    Current Checkings Account Balance: " + moneyFormat.format(currentBalance));
		System.out.print("\n    Amount you want to deposit from Checkings Account: ");
		double amount = sc.nextDouble();
		if ((currentBalance + amount) >= 0 && amount >= 0) {
			calCurrentDeposit(amount);
			System.out.println("\n      Current Checkings Account Balance: " + moneyFormat.format(currentBalance));
			
		} else {
			System.out.println("\nBalance Cannot Be Negative.");
		}
				
	}
	
	//customer saving account deposit input
	public void getSavingsDepositInput() {
		
		System.out.println("\n       Current Savings Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("\n    Enter Amount you want to deposit into your Savings Account: ");
		double amount = sc.nextDouble();

		if ((savingBalance + amount) >= 0) {
			
			calSavingDeposit(amount);
			System.out.println("\n    Current Savings Account Balance: " + moneyFormat.format(savingBalance));
			
		} else {
			System.out.println("\nBalance Cannot Be Negative.");
		}
			
		
	}
	
	
}
