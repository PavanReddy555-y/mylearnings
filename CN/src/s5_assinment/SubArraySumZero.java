 
package s5_assinment;

public class SubArraySumZero {
	
	public static void main(String[] args) {
		
		
		int[] array1 = {1,3,-7,3,2,2,1,-3,-2,-2};
		
		for(int index=0; index<array1.length; index++)
		{
			String sum = ""+array1[index];
			int summation =array1[index];
			int count =1;
			for(int indexIn=0; indexIn<array1.length; indexIn++)
			{
				sum += array1[indexIn];
				summation = array1[indexIn];
				
				if(summation==0)
				{
					char[] subArr = new char[count];
					
					subArr = sum.toCharArray();
					System.out.print("{");
					for(char element: subArr)
					{
						System.out.print(element+", ");
					}
					System.out.print("}");
					
				}
			}
		}
	}

}
