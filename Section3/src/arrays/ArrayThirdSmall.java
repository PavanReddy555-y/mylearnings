package arrays;

import java.util.*;



public class ArrayThirdSmall 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a [] = new int[n]; 
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0; j<a.length; j++)
		{
			for(int k=j+1; k<a.length; k++)
			{
				if(a[j]>a[k])
				{
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
		
		int k =sc.nextInt();
		
		
		System.out.println(a[k-1]);
		

				
				
				
		sc.close();
	}

}
