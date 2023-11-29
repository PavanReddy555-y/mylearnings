package arrayClass;

public class Array3_DescendingOrder {

	public static void main(String[] args) {

		
		int a [] = {7,2,1,6,5};
		System.out.println("befor Sorting :");
		for(int i: a) 
		{
			System.out.print(i);
		}
		
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1 ; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					a[i] = a[j] - a[i]+(a[j]=a[i]);
				}
			}
		}
		System.out.println();

		System.out.println("After Sorting :");
		for(int i: a) 
		{
			System.out.print(i);
		}

	}

}
