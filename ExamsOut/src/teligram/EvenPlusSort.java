package teligram;

import java.util.Arrays;
import java.util.Scanner;

public class EvenPlusSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		for(int i=0; i<array.length; i++)
		{
			array[i]=sc.nextInt();
		}
		int count=0;
		int zeros=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2==0)
			{
				count++;
			}
			if(array[i]==0)
			{
				zeros++;
			}
		}
		
		
		int arr[] = new int[count];
		int length = arr.length;
		int temp=0;
		for(int index=0; index<array.length; index++)
		{
			if(array[index]%2==0 )
			{
				arr[temp++]=array[index];
			}
				
		}
		
		Arrays.sort(arr);
		
		System.out.print("[");
		for(int value=0;value<arr.length; value++)
		{
			if(value!=arr.length-1 && arr[value]!=0)
			{
				System.out.print(arr[value]+", ");
			}
			if(value==arr.length-1)
			{
				System.out.print(arr[value]);
			}
		}
		if(zeros>0)
		{
			for(int i=arr.length-1-zeros;i<arr.length-1;i++)
			{
				System.out.print((", "+0));    
			}
		}
		System.out.println("]");
		
		
		sc.close();

	}

}
