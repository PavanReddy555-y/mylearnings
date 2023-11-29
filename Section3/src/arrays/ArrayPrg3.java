package arrays;

import java.util.Scanner;
 
public class ArrayPrg3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = sc.nextInt();
		int sum=0;
		int [] num = new int [size];
		System.out.println("Enter the Array values:");
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Sum of numbers is:");
		for(int j= 0;j<num.length;j++)
		{
			
			sum =sum+num[j];
				
		}
		System.out.println(sum);
		
		sc.close();

	}

}
