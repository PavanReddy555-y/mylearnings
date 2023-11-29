package session1Practice;

public class LargestNoInArray {

	public static void main(String[] args) 
	{
		int arr [] = {89, 1, 53, 21,10,105,3 };
		
		int temp = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(temp < arr[i])
			{
				temp = arr[i];
			}
		}
		
		System.err.println("Largest element in array is : "+ temp);

	}

}
