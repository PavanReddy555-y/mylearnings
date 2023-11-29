package S9_13_2_23CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountActivity {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Check Balance");
		System.out.println("2. WithDraw");
		System.out.println("3. Deposite");
		System.out.println("Choose an Option.....");
		System.out.println();
		int option = sc.nextInt();
		
		Account acnt;
		acnt= new AccountImplementation();
		
		switch(option)
		{
			case 1 :
			{
				acnt.blance();
			}break;
			
			case 2 :
			{
				System.out.println("Enter WithDraw Amount");
				double WithdrawAmt= sc.nextDouble();
				try {
					acnt.withDraw(WithdrawAmt);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}break;
			
			case 3 :
			{
				System.out.println("Enter Deposited Amount");
				double depAmt= sc.nextDouble();
				acnt.deposite(depAmt);
				
			}break;
			

		}
		
		
		

		
		
		
		
		sc.close();
	}
}
