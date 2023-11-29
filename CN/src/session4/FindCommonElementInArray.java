package session4;
import java.util.*;
public class FindCommonElementInArray {

	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] array1 ;
		array1 = insertion();
		int[] array2;
		array2 = insertion();
		if(array1.length == array2.length)
		{
			findCommonElement(array1, array2, array1.length);
		}else{
			if(array1.length<array2.length)
			{
				findCommonElement(array1, array2, array1.length);
			}
			else {
				findCommonElement(array1, array2, array2.length);
			}
		}
		
	}

	public static void findCommonElement(int[] array1, int[] array2,int min ) {
		
		boolean flag=true;
		System.out.println("The array elements are....");
		for(int index=0;index<min; index++ )
		{
			for(int indexIn=0;indexIn<min; indexIn++ )
			{
				if(array1[index]==array2[indexIn])
				{
					flag=false;
					System.out.print(array1[indexIn]+" ");
					
				}
			}
		}
		if(flag)
		{
			
		}
		
	}

	public static int [] insertion() {
		System.out.println("Enter size of an array....");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size; i++  )
		{
			arr[i]=sc.nextInt();
		}
			
		return arr;
	}

}
