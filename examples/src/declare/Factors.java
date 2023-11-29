package declare;
import java.util.Scanner;
public class Factors 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int temp =n;
		int m =sc.nextInt();
		int tem=m;
		// count =0;// =1
		
		System.out.println("factors are:");
		for(int i=n;i<m;i++)//i<=n/2
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
			if(n%j==0)
			{
				//count++;
				sum +=j;
				
				//System.out.println(j);
			}
			}
			if(sum==i)
			{
				System.out.println(" perfect Number between "+temp +" to "+tem);
			}
			
		}
		//System.out.println("\n factors count:");
		//System.out.println(count);
		//System.out.println("\n factors sum:");
		//System.out.println(sum);
		
		sc.close();
	}

}
