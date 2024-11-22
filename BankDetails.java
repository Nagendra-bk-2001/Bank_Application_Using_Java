package com.BankApplication;
import java.util.*;
public class BankDetails {
	private String accno ;
	private String name;
	private String acc_type;
	private double balance;
	
	 Scanner  sc = new Scanner(System.in);
	
	public  void OpenAccount()
	{
		System.out.println("\n *************** BANKING SYSTEM APPLICATION *************** ");
		System.out.print("Enter the Account number is  = ");
		accno = sc.nextLine();
		
		System.out.print("Enter the Account Holder name  is  = ");
		name = sc.nextLine();
		
		System.out.print("Enter the Account Type  is  = ");
		acc_type = sc.nextLine();
		
		System.out.print("Enter the Account Balance  is  = ");
		balance  = sc.nextDouble();
	}
	
	
	public void ShowAccount()
	{
		System.out.println("\n *************** BANKING SYSTEM APPLICATION *************** ");
		System.out.println("Name of Account holder :" + name);
		
		System.out.println("Account number  :" + accno);
		
		System.out.println("Account holder type :" + acc_type);
		
		System.out.println("Account balance :" + balance);
	}
	
	public void deposit()
	{
		
		System.out.println("\n *************** BANKING SYSTEM APPLICATION *************** ");
		long amount;
		
		System.out.print("Enter the amount you want deposit amount ");
		amount = sc.nextLong();
		if(amount >0)
		{
			balance += amount;
			System.out.println("Deposit successful! New balance: " + balance);
		}
		else {
	        System.out.println("Invalid deposit amount. Please enter a positive value.");
	    }
	}
	
	public void withdraw()
	{
		System.out.print("\n *************** BANKING SYSTEM APPLICATION *************** ");
		
		long amount;
		System.out.print("Enter the amount you wantto withdraw  ");
		amount = sc.nextLong();
		if(balance >=amount)
		{
			System.out.print("Your Withdraw successfull ");
			balance -=amount;
			System.out.print("Your Current balance is  : " + balance);

		}
		else
		{
			System.out.print("insuffcient bank balance " + amount + "Transaction Failed......!!!!!");
		}
	}
	
	
	public boolean search(String ac_no)
	{
		if(accno.equals(ac_no))
		{
			ShowAccount();
			return true;
		}
		return false;
	}
}
