package session4;

public class Iterators {

	public static void main(String[] args) {
		int num = 0;
		while (num < 10 ) {
			System.out.print(num+" ");
			num++;
			
		}System.out.println();
		System.out.println("Loop 1");
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(i == 5 )
				{
					break;/* this break will terminate only in side loop when i value is 5  */ 
				}
				System.out.print(i + "-" + j +"  ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Next loop........");
		/* Terminating all parent loops from child loop */
		
		xyz:
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(i == 5 )
				{
					break xyz;/* this break will terminate only in side loop when i value is 5  */ 
				}
				System.out.print(i + "-" + j +"  ");
			}
			System.out.println();
			
		}
		

	}

}
