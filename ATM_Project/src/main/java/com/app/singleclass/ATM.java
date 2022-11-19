package com.app.singleclass;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		System.out.println("Welcome to ATM project ......!");
		int balance =5000, withdraw,deposit;
		
		System.out.println("Choose an Option");
		
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			int n =sc.nextInt();
			switch(n) {
			
			case  1:
				System.out.println("Enter money to withdraw");
				withdraw =sc.nextInt();
				if(balance >= withdraw) {
					balance = balance -withdraw;
					System.out.println(" your current balance after withdrawing is "+ balance);
				}else {
					System.out.println("Insufficient Balance in your account");
				}
				break;
			case 2:
				System.out.println("Enter money to deposit");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("After depositing current balance : " + balance);
				break;
				
			case 3:
				System.out.println("Balance " + balance);
				break;
			case 4:
				System.exit(0);
				
			}
			
		}
		
							
	}

}
