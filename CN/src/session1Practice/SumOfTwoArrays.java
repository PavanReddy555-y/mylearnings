package session1Practice;

public class SumOfTwoArrays {

	public static void main(String[] args) 
	{
		int [] array1 = {1,2,3,4,5,6};
		int [] array2 = {7,8,9,10,11,12};
		
		int arraysum=0;
		int temp =0;
		for(int i=0; i<(array1.length+array2.length); i++)
		{
			if(i<=array1.length-1)
			{
				arraysum +=array1[i];
			}
			else
			{
				arraysum += array2[temp++];
			}
			 
		}
		
		System.out.println("Array sum is :"+ arraysum);

	}

}
