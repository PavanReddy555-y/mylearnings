package session4;

public class ElemensPairSumIsNum {
	
	static java.util.Scanner sc =new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int [] array1 ;
		array1 = insertion(); 
		
		findPairsOfArray(array1);
		

	}
	public static void findPairsOfArray(int[] arr) 
	{
		System.out.println("Enter a Number to find pairs for it....");
		int num = sc.nextInt();
		System.out.println("Pairs are......");
		for(int index=0; index<arr.length; index++)
		{
			for(int indexIn=index+1 ; indexIn<arr.length; indexIn++)
			{
				if(arr[index]+arr[indexIn]==num)
				{
					System.out.println(arr[index]+"-"+arr[indexIn]);
				}
			}
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
