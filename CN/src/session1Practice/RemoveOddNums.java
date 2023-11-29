package session1Practice;

public class RemoveOddNums {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Befor removing odd numbers......");
		RemoveOddNums.display(arr);
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				arr[i]=0;
			}
		}
		
		System.out.println("After Removing Odd Numbers");
		RemoveOddNums.display(arr);

	}
	
	public static void display(int [] arr)
	{
		for(int i : arr)
		{
			if(i!=0)
			System.out.print(i+" " );
		}
		System.out.println();
		
	}

}
