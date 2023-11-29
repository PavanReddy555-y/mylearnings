package arrayClass;

public class Array12_SumPairsCount 
{
	public static void main(String[] args)  
	{
		java.util.Scanner sc = new java.util.Scanner(System.in); // fully qualified name 
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int a [] = new int [size];
		System.out.println("Enter array elements...");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number to check the slements sum equals to number:");
		int num =sc.nextInt();
		
		sumPairsCheck(a, num);
		sc.close();
	}
	public static void sumPairsCheck(int []a , int num) 
	{
		int count=0;
		System.out.println("Pairs found");
		for(int i=0; i<a.length; i++)
		{	
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]== num )
				{
					System.out.println("Index value: " + i +  " - " + " Array element value: " + a[i]);
					System.out.println("Index value: " + j +  " - " + " Array element value: " + a[j]);
					count++;	
				}
			}
		}
		System.out.println();
		if(count>0)
		{
			System.out.println("count of paris is :"+count);
		}
		else
		{
			System.out.println("No paires found.....");
		}
	}


}
