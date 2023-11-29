package stringclass;

import java.util.Scanner;

public class S4_PalindromeCheck {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		String s1="";
		
		boolean check = palindromecheck(s,s1);
		if(check)
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}
	
	public static boolean palindromecheck(String s, String s1)
	{
		for(int i=s.length()-1; i>=0; i--)
		{
			s1 = s1+s.charAt(i);
		}
		
		return s.equalsIgnoreCase(s1);
	}
	
}
