package session1Practice;

import java.util.Scanner;

public class Merge3Arrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr1 [] = {1,2,3,4,5};
		int arr2 [] = {6,7,8,9,10}; 
		int arr3 [] = {11,12,13,14,15};
		
		
		int arrMain[] = new int[(arr1.length+arr2.length+arr3.length)];
		
		//int temp1=0;
		int temp=0;
		
		for(int i=0; i<arrMain.length; i++)
		{
			if(i<arr1.length)
			{
				arrMain[i]=arr1[i];
			}
			else if(i>arr1.length-1 && i<(arr1.length+arr2.length)) 
			{
				arrMain[i] = arr2[i-arr1.length];
			}
			else
			{
				//if(i<arrMain.length)
				arrMain[i] = arr3[temp++];
			}
		}
		
		for(int val : arrMain)
		{
			System.out.print(val+" ");
		}
		
		

	}
	

}
