package arrayClass;

import java.util.Scanner;

public class Array10_RightRotate 
{
	public static int[] rightRotateArray(int []arr,int count)
	{
		while(count!=0)
		{
			int temp = arr[arr.length-1];
			for(int i=arr.length-2;i>=0; i-- )
			{
				arr[i+1] = arr[i];
			}
			arr[0]=temp;
			count--;
		}

	
		return arr;
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
		int[] rotatearray = rightRotateArray(arr , count);
		for(int j:rotatearray)
		{
			System.out.print(j+" ");
		}
		
		sc.close();

	}

}
