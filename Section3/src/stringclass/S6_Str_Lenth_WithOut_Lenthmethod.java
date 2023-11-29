package stringclass;

import java.util.Scanner;

public class S6_Str_Lenth_WithOut_Lenthmethod {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		System.out.println("Length of the String is :"+lengthwithoutlength(s));

		sc.close();

	}
	public static int lengthwithoutlength(String s)
	{
		char [] c = s.toCharArray();
		int count=0;
		for(char i: c )
		{
			count++;
		}
		return count;
	}

}
