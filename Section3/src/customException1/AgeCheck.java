package customException1;

import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of a Person.....");
		int age = sc.nextInt();
		if(age<18)
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		
		sc.close();

	}

}
