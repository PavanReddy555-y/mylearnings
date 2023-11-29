package stringclass;

//import java.util.Arrays;
import java.util.Scanner;

public class S7_AnagramString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1 = sc.next();
		System.out.println("Enter the 2nd String");
		String s2 = sc.next();
		
		//char [] c1 = s1.toCharArray();
		//char [] c2 = s2.toCharArray();

		/*		Arrays.sort(c1);
		Arrays.sort(c2);
		//System.out.println(Arrays.equals(c1, c2)); */

		if(s1.length()==s2.length())
		{
			char c1 [] = new char [s1.length()];
			char c2 [] = new char [s2.length()];
			
			for(int i=0; i<s1.length();i++) // Converting to Character Array
			{
				c1[i]=s1.charAt(i);
				c2[i]=s2.charAt(i);
			}

			for(int i=0; i<c1.length; i++) // Sorting the c1 array
			{
				for(int j=i+1; j<c1.length; j++)
				{
					if(c1[i]>c1[j])
					{
						char temp = c1[i];
						c1[i] =c1[j];
						c1[j] = temp;
						
						//c1[i] = (char)  ( c1[j] - c1[i]+(c1[j]=c1[i]));
					}
				}
			}
			for(char c:c1)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
			for(int i=0; i<c2.length; i++) // sorting the c2 Array
			{
				for(int j=i+1; j<c2.length; j++)
				{
					if(c2[i]>c2[j])
					{
						char temp = c2[i];
						c2[i] =c2[j];
						c2[j] = temp;
						
						//c2[i] = (char)  ( c2[j] - c2[i]+(c2[j]=c2[i]));
					}
				}
			}
			for(char c:c2)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
			
			
			boolean check=true ;
			
			for(int i=0; i<c1.length; i++) // 
			{
				if(c1[i] != c2[i] )
				{
					check=false;
					break;
				}
			}
			if(check)
			{
				System.out.println("Strings are  ANAGRAM");
			}
			else {
				System.out.println("Strings are not a ANAGRAM");
			}
			
		}
		else
		{
			System.out.println("Strings are not a ANAGRAM");
    	}
		
		
		sc.close();
						/*
						 Enter the 1st String
					listen
					Enter the 2nd String
					silent
					e i l n s t 
					e i l n s t 
					Strings are  ANAGRAM */
			 

	 }
								

}
