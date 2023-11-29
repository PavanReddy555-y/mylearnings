package arrayClass;

public class Array4_LargeElement {

	public static void main(String[] args) {
		int a [] = {7,2,1,6,5};
		System.out.println("befor Sorting :");
		for(int i: a) 
		{
			System.out.print(i);
		}
		System.out.println();
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			
				if(a[i] > max)
				{
					max = a[i];
				}
			
		}
		System.out.println( "Largest value is : "+max);
	}

}
