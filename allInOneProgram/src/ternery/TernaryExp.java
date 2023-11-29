package ternery;

import java.util.Scanner;

public class TernaryExp {

	public static void main(String[] args) {
		int a =10;
		int b = 50;
		int num = a<b?a:b; // ternary operator
		System.out.println(num);
		// wap to print smallest number among 4 numbers by using Ternary Operator
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int samallNum = (int) ((c<d && c<e && c<f) ? c: (d<e && d<f)? d : (e<f)?e:f); 
		System.out.println("smallest Number : "+ samallNum);

	}

}
