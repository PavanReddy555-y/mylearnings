package arrayClass;

import java.util.Scanner;

public class Array8_Frequency 
{

	public static void frequency( String s)
	{
		char c[] = s.toCharArray();
		
		int [] f = new int [c.length];
		
		for(int i=0; i<c.length;  i++)
		{
			f[i]=1;
			for(int j=i+1; j<c.length;  j++)
			{
				if(c[i]== c[j] && c[j]!='0')
				{
					f[i]++;
					c[j]='0';
				}
			}
		}
		
		for(int i=0;  i<c.length; i++)
		{
			if(c[i]!= '0')
			{
				System.out.println(c[i] +" - "+f[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String  s = sc.next();
		
		frequency(s);
		sc.close();
	}

}
