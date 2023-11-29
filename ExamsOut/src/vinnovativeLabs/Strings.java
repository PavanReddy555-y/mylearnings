package vinnovativeLabs;

import java.util.Scanner;

public class Strings {
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String....");
			String str = sc.next().toLowerCase();
			
			System.out.println(stringChecking(str));
			
			sc.close();

		}
		public static boolean stringChecking(String str )
		{
			for(char ch='a'; ch<='z'; ch++) {
				for(int i=0; i<str.length();i++) {
					if(str.charAt(i)==ch)
					{
						if(str.charAt(i)==0 || str.charAt(i) != str.length()-1)
						{
							return false;
						
						}
						else
						{
							if(str.charAt(i-1)== '+'  )
							{
								return false;
							}
						}

					}
					
				}
			}
			
			
			
			return true;
		}

	

}
