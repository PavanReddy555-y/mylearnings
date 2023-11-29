package arrayClass;

public class ChallengeSum 
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
		
		sumCheck(a, num);
		sc.close();
	}
	public static void sumCheck(int []a , int num) 
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == num)
			{
				System.out.println("Element found");
				System.out.println(a[i]+ " - "+ i);
			}
			else
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]+a[j]==8 && a[i]!=8 && a[j]!=8)
					{
						System.out.println("Pair found");
						System.out.println("Index value: " + i +  " - " + " Array element value: " + a[i]);
						System.out.println("Index value: " + j +  " - " + " Array element value: " + a[j]);
						return;
					}
				}
			}

		}
		System.out.println("No Paires in an array......");
	}
	
}
