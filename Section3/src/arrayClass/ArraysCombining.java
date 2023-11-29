package arrayClass;

public class ArraysCombining {

	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,9,10,11};
		int [] c = new int [a.length+b.length];
		
		int temp = 0;
		
		for(int i=0; i<c.length; i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[temp++];
			}
		}
		for(int j=0; j<c.length; j++)
		{
			System.out.print(c[j]+" ");
		}

	}

}
