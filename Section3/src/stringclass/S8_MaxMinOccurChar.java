package stringclass;

import java.util.Scanner;

public class S8_MaxMinOccurChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String");
		String s = sc.nextLine();
		int [] f = new int[s.length()];
		
		char[] c = s.toCharArray();
		
		for(int i=0; i<c.length; i++)
		{
			f[i]=1;
			for(int j=i+1; j<c.length; j++)
			{
				
				if(c[i]==c[j] &&  c[j]!='0')
				{
					f[i]++;
					c[j]='0';
				}
			}
			
		}
		
		int max = f[0];
		int min = f[0];
		int min_index =0;
		int max_index =0;
				
		for(int i=0; i<c.length; i++)
		{
			if(max<f[i] && c[i]!=0)
			{
				max = f[i];
				max_index = i;
			}
			
			if(min>f[i] && c[i]!=0)
			{
				min = f[i];
				min_index = i;
			}
			
			
		}
		
		
		
		
		System.out.println("maximum occurance char : "+ c[max_index]+" - " +f[max_index]);
		System.out.println("minimum occurance char : "+ c[min_index]+" - " +f[min_index]);

		
		sc.close();

	}

}
