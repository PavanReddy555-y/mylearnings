package exceptions;

import java.util.Scanner;

public class AccountDriver 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Select Bank====== ");
		System.out.println("1.ICICI Bank");
		System.out.println("2.SBI Bank");
		System.out.println("Enter the choice:");
		int choice =sc.nextInt();
		
		switch (choice)
		{
			case 1:
			{
				System.out.println("===== Welcome to ICICI Bank =====");
				System.out.println("choose the Transaction");
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("choose");
				int trans = sc.nextInt();
				ICICIBank ici = new ICICIBank();
				switch (trans)
				{
				
					case 1:
					{
						ici.deposit();
					}break;
					case 2:
					{
						ici.withdraw();
					}
				}
				
			}break;
			case 2:
			{
				System.out.println("=====Welcome to SBI Bank=====");
				System.out.println("choose the Transaction");
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("choose");
				int trans = sc.nextInt();
				SBIAccounts sbi = new SBIAccounts();
				switch (trans)
				{
					case 1:
					{
						sbi.deposit();
					}
					break;
					case 2:
					{
						sbi.withdraw();
					}
				}
				
			}
		}
	
		sc.close();

	}

}
