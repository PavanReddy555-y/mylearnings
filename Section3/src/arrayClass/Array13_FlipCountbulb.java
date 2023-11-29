package arrayClass;

import java.util.Scanner;

public class Array13_FlipCountbulb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbe of bulbs need: ");
		int bulbno=sc.nextInt();
		boolean[] b = new boolean [bulbno];
		System.out.println("Enter how many command you need ");
		int com = sc.nextInt();
		
		String[] s = new String [com];
		System.out.println("Enter commmands"); /* ex: F13 C02  F11 F03 C03 C23 */
		for(int i=0; i<s.length; i++)
		{
			s[i] = sc.next().toUpperCase();
		}
				
				
		 bulbsCount(b,s);

		sc.close();
	}
	
	public static void bulbsCount(boolean [] b, String [] s) 
	{
		for(int i=0; i<s.length; i++)
		{
			String s1 = s[i];
			if(s1.charAt(0)== 'F')
			{
				int x = Character.getNumericValue(s1.charAt(1));
				int y = Character.getNumericValue(s1.charAt(2));
				for(int j=x; j<=y; j++)
				{
					b[j] = !b[j];
				}

			}
			else
			{
				int count = 0;
				int x = Character.getNumericValue(s1.charAt(1));
				int y = Character.getNumericValue(s1.charAt(2));
				
				for(int j=x; j<=y; j++)
				{
					if(b[j])
					{
						count++;
					}
				}
				System.out.println(count);
			}
		}
		
	}

	

}
