package set1;

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FlowControls {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1.Write a program to print Non-prime numbers from 1 to 100 using for, while and do-while loop?
		
		//nonPrimeNumbersWithFor();
		System.out.println();
		//nonPrimeNumbersWithWhile();
		System.out.println();
		
		//2.Write a program to find the grade based on total marks obtained using switch and if else conditions?
		//System.out.println("Enter Total marks obtained..");
		//int totalMarks = input.nextInt();
//		xyz:
//			for(int i =0;i<10; i++) {
//				for(int j = 0;j<10; j++){
//					System.out.println(i+" - "+j);
//					break xyz;
//				}
//			}
//		
		for(int i=1;i<10;i++) {
			if(i==5)
			System.out.println(i);
		}
		
	}

	

	private static void nonPrimeNumbersWithFor() {
		System.err.println("Non Prime Number Printing With For Loop : ");
		for(int index=1; index<=100;index++ ) {
			int count = 0;
			for(int innerIndex = 2; innerIndex<=(index/2); innerIndex++) {
				if(index%innerIndex==0) {
					count++;
				}
			}
			if(count!=0 || index == 1) {
				System.out.print(index+" ");
			}else {
				System.err.print(index+ " ");
			}
		}
		
	}
	private static void nonPrimeNumbersWithWhile() {
		System.err.println("Non Prime Number Printing With While Loop : ");
		int index=1;
		while(index<=100) {
			int count=0;
			int innerrindex=2;
			while(innerrindex<= index/2) {
				if(index%innerrindex==0) {
					count++;
				}
				innerrindex++;
			}
			if(count!=0 || index == 1) {
				System.out.print(index+" ");
			}else {
				System.err.print(index+ " ");
			}
			index++;
		}
		
	}

}
