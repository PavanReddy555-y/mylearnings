package declare;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		if(n<2)
		{
			System.out.println(n+" is not a composite  not a prime no");			
		}
		else 
		{
			for( int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
			}
		}
		if (count==1) 
		{
			System.out.println(n+" is not a Prime no");
		}
		else
		{
			System.out.println(n+" is  a Prime no");
		}
		
		sc.close();
	}

}
