package arrayClass;

public class Arryau5_DuplicateRemove {

	public static void main(String[] args) 
	{
		int a [] = {10,20,20,30,10};
		
		
		int[] arr = removeDuplicates(a);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

		
		public static int[] removeDuplicates(int a[]) 
		{
			int count=0;
			
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j] && a[j]!= -1)
					{
						a[j]=-1;
						count++;
					}
				}
			}
		
			int b [] = new int [a.length-count];
			int temp=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!= -1)
				{
					b[temp++]= a[i];
				}
			}
			
			return b;
		}
		
		
	

}
