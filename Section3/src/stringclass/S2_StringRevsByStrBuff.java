package stringclass;

import java.util.Scanner;

public class S2_StringRevsByStrBuff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		System.out.println("String before reversen: "+s);
		String reveString=revesedString(s);
		System.out.println("Reversed String is: "+reveString);
		sc.close();
	}
	public static String revesedString(String s)
	{
		StringBuffer sb1 = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer(" ");
		
		for(int i=sb1.length()-1;i>=0;i--)
		{
			sb2.append(sb1.charAt(i));
		}
		
		String s1 = new String(sb2);
		
		return s1;
	}
}
 