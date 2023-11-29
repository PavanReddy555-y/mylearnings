package arrays;

import java.util.Scanner;

public class ArrayPrg1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int size = sc.nextInt();
		String [] names = new String[size];
		System.out.println("Enter the names of the students:");
		for(int i=0;i<size;i++)
		{
			names[i]= sc.next();
		}
		System.out.println("Students names are:");
		for(int j=0;j<size;j++) 
		{
			System.out.println(names[j]);
		}
		
		sc.close();
	}

}
