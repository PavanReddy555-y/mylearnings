package stringclass;

import java.util.Scanner;

public class S3_WordCountInStr {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		System.out.println("Given String is : "+s);
		int count=0;

		int wordCount = countofWords(s ,count);
		System.out.println("Count of words in string is : "+wordCount);
		sc.close();
	}
	
	public static int countofWords(String s, int count)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(i==0&&s.charAt(i)!=' ' || s.charAt(i)!=' '&&s.charAt(i-1)==' ') 
			{
				count++;
			}
		}
		
		return count;
	}

}
