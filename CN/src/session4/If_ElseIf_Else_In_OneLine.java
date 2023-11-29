package session4;

import java.util.Scanner;

public class If_ElseIf_Else_In_OneLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1");
		int numOne = sc.nextInt();
		System.out.println("Enter num 2");
		int numTwo = sc.nextInt();
		System.out.println("Enter num 3");
		int numThree = sc.nextInt();
		
		int x =1;
		double d = x;
		int y =(int) d;
		int bigNum = bigNumber(numOne,numTwo,numThree);
		System.out.println("Biggest Number is : "+ bigNum);
		sc.close();
	}
	
	
	public static  int bigNumber(int n1,int n2,int n3)
	{
		int bigNo = (n1>n2 && n1>n3)? n1:(n2>n3)?n2: n3 ;
		return bigNo;
	}
}
