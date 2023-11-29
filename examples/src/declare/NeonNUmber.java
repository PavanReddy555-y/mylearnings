package declare;
import java.util.Scanner;
public class NeonNUmber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Number:");
		int n = scan.nextInt();
		int sq= n*n;
		int sum=0;
		while(sq>0)
		{
			int rem = sq%10;
			sum+=rem;
			sq/=10;
		}
		if(n==sum)
		{
			System.out.println(n+" is a neon Number");
			
		}
		else
		{
			System.out.println(n+" is not a neon number");
		}
		scan.close();
	}

}
