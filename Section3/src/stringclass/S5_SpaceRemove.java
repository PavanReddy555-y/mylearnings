package stringclass;

import java.util.Scanner;

public class S5_SpaceRemove 
{
	public static String removeSpace(String s, String s1)
	{
		int i =0;
		while(i<s.length())
		{
			if(s.charAt(i)!= ' ')
			{
				s1=s1+s.charAt(i);
			}
			i++;
		}
		return s1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ;");
		String s = sc.nextLine();
		System.out.println("Before removing spaces: "+s);
		String s1="";
		
		String str = removeSpace(s,s1);

		System.out.println("After remoing Spaces : "+str);

		
		sc.close();
	}

}
