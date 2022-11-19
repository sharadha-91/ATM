package com.app.optionmenu;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
	
   Scanner sc = new Scanner(System.in);
   DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
   HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	
   public void getLogin() {
	   int x=1;
	   
	   do {
		    try {
		    	
		    	data.put(9876543,9876);
		    	data.put(1234567,1234);
		    	
		    	System.out.println("-------- Welcome to Sharadha Atm -------");
		    	
		    	System.out.println("Enter Customer Number :");
	            setCustomerNumber(sc.nextInt());
	            
	            System.out.println("Enter Pin Number:");
	            setPinNumber(sc.nextInt());
	            
		    }catch(Exception e){
		    	
		    	System.out.println("\nInvalid Character(s). Only Numbers.");
		    	x=2;
		    }
		    
		    for(Entry<Integer,Integer> entry:data.entrySet()){
		    	if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
		    		getAccountType();
		    	}
		    }
		    System.out.println(" Wrong Customer Number or Pin Number ");
		    
		    
	   }while(x==1);
	   
 }
   
   
   //Display Account type menu with selection
   
   	public void getAccountType() {
   		
   		System.out.println(" Select the account you want:");
   		System.out.println("1. Current Account");
   		System.out.println("2. Savings Account");
   		System.out.println("3. Exit");
   		System.out.println("Choice:");
   		
   		int selection = sc.nextInt();
   		
   		switch(selection) {
   		
   		case 1: 
   			 getCurrent();
   		     break;
   		case 2:
   			 getSaving();
   			 break;
   		case 3: 
   			System.out.println(" Thank you for using this ATM ...");
   			break;
   		default:
   			System.out.println(" Invalid choice " +"\n");
   			getAccountType();
   		     
   		}	
   	}
   	
   	public void getCurrent() {
   		System.out.println(" ****  Current Account  ****");
   		System.out.println("1. View Balance");
   		System.out.println("2. Withdraw funds");
   		System.out.println("3. Deposit Funds");
   		System.out.println("4. Exit");
   		System.out.println("Choice");
   		
   		int selection = sc.nextInt();
   		switch(selection) {
   		case 1:
   			System.out.println("\n       Checkings Account Balance: " + moneyFormat.format(getCurrentBalance()));
   		    getAccountType();
   		    break;
   		case 2: 
   			getCurrentWithdrawInput();
   			getAccountType();
   			break;
   		case 3:
   			getCurrentDepositInput();
   			getAccountType();
   			break;
   		case 4:
   			System.out.println("Thank you for using ATM...!");
   			break;
   		default:
   			System.out.println("\n" + "Invalid choice "+"\n");
   			getCurrent();
   		}
   		
   	}
   	
   	public void getSaving() {
   		System.out.println(" ****  Savings Account **** ");
   		System.out.println("1. View Balance ");
   		System.out.println("2. Withdraw Funds  ");
   		System.out.println("3. Deposit Funds ");
   		System.out.println("4. Exit  ");
   		System.out.println("Choice  ");
   		
   		int selection = sc.nextInt();
   		
   		switch(selection) {
   		case 1:
   			System.out.println("\n      Savings Account Balance: " + moneyFormat.format(getSavingBalance()));
   			getAccountType();
   			break;
   		case 2:
   			getSavingsWithdrawInput();
   			getAccountType();
   			break;
   		case 3: 
   			getSavingsDepositInput();
   			getAccountType();
   			break;
   		case 4:
   			 System.out.println("Thank you for using the ATM");
   			 break;
   		default:
   			System.out.println("\n"+"Invalid choice" + "\n");
   			getSaving();
   		
   		}
   		
   		
   		
   	}
   
 

}
