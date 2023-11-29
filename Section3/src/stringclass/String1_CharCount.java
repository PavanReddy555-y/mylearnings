package stringclass;

import java.util.Scanner;

public class String1_CharCount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String s = sc.nextLine();
		int i=0;
		int count=0;
		while(i<s.length())
		{
			if(s.charAt(i)!= ' ')
			{
				count++;
			}
			i++;
		}
		System.out.println("Count of Charecters in the String are:"+count);
		
		
		
		sc.close();
	}

}
