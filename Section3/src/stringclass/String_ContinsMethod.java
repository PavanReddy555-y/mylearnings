package stringclass;

import java.util.Scanner;

public class String_ContinsMethod {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String :");
		String s1 = sc.next().toLowerCase();
		System.out.println("Enter the 2nd String :");
		String s2 = sc.next().toLowerCase();
		System.out.println(containscheck(s1,s2));
		sc.close();
	}
	public static boolean containscheck(String s1, String s2) 
	{
		boolean flag = false;
		for(int i=0; i<s1.length();i++)
		{
			if(s1.length()-i>=s2.length())
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					int count = 1;
					for(int j=1; j<s2.length();j++)
					{
						if(s2.charAt(j)==s1.charAt(i+j) && (i+j)<s1.length())
						{
							count++;
						}
						else
						{
							break;
						}
					}
					if(count==s2.length())
					{
						flag=true;
						break;
					}
				}
			}
		}
		return flag;

	}

}
