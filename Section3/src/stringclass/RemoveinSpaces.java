package stringclass;
import java.util.Scanner;

public class RemoveinSpaces {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		
		String s2="";
		System.out.println(spaceRemover(s1,s2));

		//System.out.println(s2);
		sc.close();
		}
	public static String spaceRemover(String s1, String s2)
	{
		int m=0;
		while(m<s1.length())
		{
			if(s1.charAt(m)!=' ') 
			{
				s2=s2+s1.charAt(m);
			}
			m++;
		}
		return s2;
	}
	
	
	
}

 