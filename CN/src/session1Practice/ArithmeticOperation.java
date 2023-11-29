package session1Practice;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in) ;
		int exitNum = 1;
		while(exitNum != 0)
		{
			System.out.println("Enter the number one.......");
			int num1 = sc.nextInt();
			System.out.println("Enter the number two.......");
			int num2 = sc.nextInt();
			
			System.out.println("Choose the option to do an operation as given bellow.....");
			System.out.println("1. Summation");
			System.out.println("2. Supraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Getting Quotient");
			System.out.println("5. Getting Reminder");
			System.out.println("6. Exit from the Program");
			
			System.out.println(" \n Enter the choice........");
			int choice = sc.nextInt();
			int result = ArithmeticOperation.switchMethod(choice,num1, num2);
			if(result!= -1 && result != -2)
			{
				System.out.println(result);
			}
			else if(result== -2)
			{
				exitNum = 0;
			}
			 System.out.println("==============================================");
		}
		sc.close();
	}

	
	
	
	private static int switchMethod(int choice,int num1, int num2) 
	{
		
		switch(choice) 
		{
			case 1 :
			{
				return num1+num2;
			}
			case 2 :
			{
				return num1-num2;
			}
			case 3 :
			{
				return num1*num2;
			}
			case 4 :
			{
				return num1/num2;
			}
			case 5 :
			{
				return num1%num2;
			}
			case 6 :
			{
				return -2;
			}
			default :
			{
				System.out.println("Choose an option in given choisec......");
			}
		}
		
		return -1;
	}

}
