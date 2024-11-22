package com.BankApplication;

import java.util.*;
public class BankAppp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" How many number of Customer do you went to input : ");
		
		int n = sc.nextInt();
		
		BankDetails c[] = new BankDetails[n];
		
		for(int i =0;i<c.length;i++)
		{
			c[i] = new BankDetails();
			c[i].OpenAccount();
		}
		
		int ch;
		do 
		{
			System.out.println("\n *************** BANKING SYSTEM APPLICATION *************** ");
			
			System.out.println("1.Display all account details \n2.Search By Acoount number \n 3. Deposit the amount \n 4. Withdraw the Amount \n 5. Exit ");
			System.out.print("Enter the your choice :  ");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 : for(int i = 0 ; i < c.length ; i++)
							{
								c[i].ShowAccount();
							}
				
				case 2 : System.out.print("Enter Account number you want to search  :");
						String ac_no = sc.next();
						 boolean found = false ;
						 
						 for(int i =0;i<c.length;i++)
						 {
							 found = c[i].search(ac_no);
							 if(found)
							 {
								 break;
							 }
							 if(!found)
							 {
								 System.out.print("Search failed !! Account doesn't exits.....!! ");
							 }
						 }
						 break;
				case 3 : System.out.print("Enter the account number : ");
						 ac_no = sc.next();
						found  = false;
						for(int i =0;i< c.length;i++)
						{
							found =c[i].search(ac_no);
							if(found)
							{
								c[i].deposit();
								break;
							}
							
						}
						
						if(!found)
						{
							System.out.print("Search failed !! Account doesn't exits.....!! ");
						} 
						
						
				case 4 : System.out.print("Enter the  account number : ");
						ac_no = sc.next();
						found = false;
						for(int i =0;i< c.length;i++)
						{
							found = c[i].search(ac_no);
									if(found)
									{
										c[i].withdraw();
										break;
									}
						}
						if(!found)
						{
							System.out.print("Search failed !! Account doesn't exits.....!! ");
						} 
						
						
				case 5 : System.out.print("see you soon...!!! try again ");
						break;
						
			}
		} while(ch !=5);
		

	}

}
