package patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);			
		int r =sc.nextInt();
		int space=r-1;
		int star=1;
		if(r%2==0)
		{
			r=r+1;
		}
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<=r/2)
			{
			space--;
			star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
		sc.close();
		
	}

}
