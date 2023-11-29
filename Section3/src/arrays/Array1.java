package arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size=sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter array elemen values...");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array are.......");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		
		
		
		
		sc.close();
	}

}
