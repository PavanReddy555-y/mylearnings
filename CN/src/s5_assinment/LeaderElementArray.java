package s5_assinment;

import java.util.Arrays;

public class LeaderElementArray {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int[] array1 = {5,6,3,1,2,9};
		boolean flag = false;
		for(int index =0; index<array1.length; index++ )
		{
			String subArray=""+array1[index] ;
			for(int indexIn =index+1; indexIn<array1.length; indexIn++ )
			{
				if(array1[index]>array1[indexIn] )
				{
					subArray+=(","+array1[indexIn]);
					
				}
				else {
					if(subArray.length()!=1 && indexIn != array1.length-1  )
					{
						System.out.println("[ "+subArray+" ]");
					}
					else
					{
						flag = true;
					}
					break;
				}
			}
			
		}
		if(flag)
		{
			System.out.println("No Sub arrays are found ");
		}*/
		
		int[] arr = {5,6,3,1,2};
		
		for(int i=0; i<arr.length-1; i++)
		{
			int count = 0;
			boolean flag=true;
			int k=i+1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
				}
				else
				{
					flag=false;
					break;
				}
			}
			//int[] subArr = new int[count];
			if(flag) {
				int[] res=new int[count+1];
				int index = 0;
				res[index++]=arr[i];
				for(;k<arr.length;k++)
				{
					res[index++]=arr[k];
				}
				System.out.println(Arrays.toString(res));
			}
			
			
			
		}
		
	}

}
