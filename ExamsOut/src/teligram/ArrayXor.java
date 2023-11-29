package teligram;

import java.util.Scanner;

public class ArrayXor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		for(int i=0; i<array.length; i++)
		{
			array[i]=sc.nextInt();
		}
		
		int result = ArrayXor.findXor(array);
		System.out.println(result);
		
		
		sc.close();
	}

	private static int findXor(int[] array) {
		int xor = 0;
		for(int index=0;index<array.length; index++ )
		{
			for(int indexIn=index+1;indexIn<array.length; indexIn++ )
			{
				xor += (array[index]^array[indexIn]) ;
			}
		}
		return xor;
	}

}
