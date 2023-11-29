package exceptions;

import java.util.Scanner;

public class SBIAccounts implements Account
{
	
	double balance = 20000;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void deposit() 
	{
		System.out.println("Enter Amount:");
		int amt =sc.nextInt();
		if(amt %10==0 && amt >=100)
		{
			balance=amt+balance;
			System.out.println("Deposited amount:"+amt);
			System.out.println("Balance Available:"+balance);
			System.out.println("======Welcome To SBI=======");
			
		}
		else
		{
			System.out.println("Only Multiples are allowed, like 100,200,500,2000.....");
		}
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Enter Amount:");
		int amt =sc.nextInt();
		if(amt < balance)
		{
			balance=balance-amt;
			System.out.println("Withdral amount:"+amt);
			System.out.println("Balance Available:"+balance);
		
		}
		else
		{
			try {
				throw new InsufficientFundsException();
			} 
			catch (InsufficientFundsException e) {
				System.out.println("Exception Handled");
			}
		}
		
		
	}

}
