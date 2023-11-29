package declare;
import java.util.Scanner;
public class StrongNum 
{
	public static void main(String[] args) 
	{
		
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	        int sum=0;
	        int temp=n;
	        while(n>0)
	        {
	            int rem =n%10;
	            int fact=1;
	            for(int i=1;i<=rem;i++)
	            {
	                fact=fact*i;
	            }
	            sum=sum+fact;
	            n=n/10;
	        }
	        if(sum==temp)
	        {
	            System.out.println(temp+ "  is a strong Numberr");
	        }
	        else
	        {
	            System.out.println(temp+ "  is not a strong Numberr");
	        }
	        
	     sc.close(); 
	}

}
