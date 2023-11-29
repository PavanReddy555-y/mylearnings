package arrayClass;

import java.util.Scanner;

public class Array5_2ndLargest 
{
	
	public static int secondLargeNo(int[] arr)
	{
		// Removing duplicates
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && arr[j]!= -1)
				{
					arr[j]= -1;  // assigning the one indicating number in that index position
					count++;
				}
			}
		}
		
		// assigning the one array values into another array without duplicates.
		int b [] = new int[arr.length-count];
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!= -1)
			{
				b[temp++] = arr[i];
			}
		}
		if(b.length>=2)
		{
			for(int k=0; k<b.length; k++)
			{
				for(int m=k+1; m<b.length; m++ )
				{
					if(b[k] > b[m])
					{
						b[k] = b[m] - b[k]+(b[m]=b[k]);
						
								//or
						/*int tem = b[k];
						b[k] = b[m];
						b[m] = tem;*/
					}
				}
			}
			
			return b[b.length-2];
		}
		else
		{	
			return 0;
		}

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		System.out.println("Enter the arrya elements....");
		for(int i=0; i<arr.length; i++)
		{
			
			 arr [i]= sc.nextInt();
		}
		
		if(secondLargeNo(arr) != 0)
		{
			System.out.println("Second Largest Number is : "+secondLargeNo(arr) );
		}
		else
		{
			System.out.println("There is no Second largest Number...");
		}

		sc.close();

	}

}
