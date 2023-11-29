package arrays;

import java.util.Scanner;

public class ArrayPrg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = sc.nextInt();
		
		int [] num = new int [size];
		System.out.println("Enter the Array values:");
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Even numbers are:");
		for(int j= 0;j<num.length;j++)
		{
			if(num[j]%2==0)
			{
			System.out.println(num[j]);
			}
			
		}
		
		
		sc.close();
	}

}
