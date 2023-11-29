package arrayClass;

public class Array2_Swapping {

	public static void main(String[] args) {
		
		int a [] = {7,2,1,6,5};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1 ; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i]-a[j];
				}
			}
		}

		
		for(int i: a) 
		{
			System.out.print(i);
		}
	}

}
