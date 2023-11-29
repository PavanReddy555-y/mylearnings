package arrayClass;

import java.util.Scanner;

public class Array11_rightShiftLoop 
{
	public static void rightRotateArray(int []arr,int count)
	{
		int num=1;
		while(count!=0)
		{
			int temp = arr[arr.length-1];
			for(int i=arr.length-2;i>=0; i-- )
			{
				arr[i+1] = arr[i];
			}
			arr[0]=temp;
			count--;
			System.out.println(num++ +" Shipt");
			for(int i: arr)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int arr [] = new int[n];
		System.out.println("Enter array element values:");	
		for(int i=0; i<arr.length;  i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter how many times rotation want");
		int count=sc.nextInt();
		rightRotateArray(arr , count);
		
		
		sc.close();

	}
}
