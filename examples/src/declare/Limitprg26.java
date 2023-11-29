package declare;
import java.util.Scanner;
public class Limitprg26 
{

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int sum = 0;
		
		for ( ;n>0; n=n/10)
		{
			int rem = n%10;
			sum+=rem;
		}
			if(temp <26)
			{
				System.out.println(sum);
			}
			while(sum>26)
			{
				int add = 0;
				while(sum>0)
				{
					int remi = sum%10;
					add+=remi;
					sum/=10;
					
				}
				System.out.println(add);
			}
		
		
		
		sc.close();
		
	}

}
