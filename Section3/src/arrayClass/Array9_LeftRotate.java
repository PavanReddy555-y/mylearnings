package arrayClass;

import java.util.Scanner;

public class Array9_LeftRotate 
{
	
	public static int[] leftRotate(int [] arr, int count)
	{
		
		
		while(count!=0)
		{
			int temp = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			arr[i-1] = arr[i];
		}
		arr[arr.length-1]=temp;
		count--;
		}
		
		
		return arr;
	}

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number how many left rotates you want: ");
		int count =sc.nextInt();
		
		int[] rotatedArray =leftRotate(arr,count);
		
		for(int i:rotatedArray)
		{
			System.out.print(i+" ");
		}
		
		
		
		sc.close();
	}

}
