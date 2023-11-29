package customException2;

import java.util.Scanner;

public class AgeCheck_checkedExcep {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a Person...");
		int age = sc.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		
		sc.close();
	}

}
