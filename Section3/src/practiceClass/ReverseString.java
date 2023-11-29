package practiceClass;

import java.util.Scanner;

public class ReverseString {
	
	
	 //static String rev="";
	
	public static void reverse(String s)
	{
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		//return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string which u want to reverse");
		String s=sc.next();
		//System.out.println(reverse(s));
		reverse(s);
		sc.close();
	}

}
